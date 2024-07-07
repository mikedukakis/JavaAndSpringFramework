package sprint3.n1exericici1;

public class App {
    private String text;
    private String oldText;
    private final Undo undoManager;

    public App() {
        this.text = "";
        this.undoManager = Undo.getInstance();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOldText() {
        return oldText;
    }

    public void setOldText(String oldText) {
        this.oldText = oldText;
    }

    public int userOption() {
        int option;
        option = KeyboardInputHandling.readInt("Please, choose an option [0-8]:");
        return option;
    }

    public String menu() {
        return "Choose an option [0-9]:\n" +
                "0. Exit\n" +
                "1. Enter text\n" +
                "2. Convert text to upper case\n" +
                "3. Convert text to lower case\n" +
                "4. Remove a letter\n" +
                "5. Replace a letter\n" +
                "6. Remove spaces\n" +
                "7. Undo\n" +
                "8. Show command history";
    }

    public boolean optionManager() {
        boolean exit = false;
        System.out.println(menu());
        switch (userOption()) {
            case 0:
                System.out.println("Thanks for using the Text Editor!");
                exit = true;
                break;
            case 1:
                inputText();
                System.out.println("Text saved: " + this.text);
                break;
            case 2:
                this.oldText = this.text;
                this.text = TextEditor.toUpperCase(this.text);
                System.out.println(this.text);
                undoManager.addCommand("Turn to upper case.", this.oldText, this.text);
                break;
            case 3:
                this.oldText = this.text;
                this.text = TextEditor.toLowerCase(this.text);
                System.out.println(this.text);
                undoManager.addCommand("Turn to lower case.", this.oldText, this.text);
                break;
            case 4:
                this.oldText = this.text;
                System.out.println("Enter the letter you want to remove from all the text");
                String oldLetter = String.valueOf(KeyboardInputHandling.readChar("Please enter a character"));
                this.text = TextEditor.removeLetter(getText(), oldLetter);
                System.out.println(this.text);
                undoManager.addCommand("Remove letter " + oldLetter, this.oldText, this.text);
                break;
            case 5:
                this.oldText = this.text;
                System.out.println("Enter the character to replace:");
                char oldChar = KeyboardInputHandling.readChar("Please enter the character to replace:");
                System.out.println("Enter the new character:");
                char newChar = KeyboardInputHandling.readChar("Please enter the character to replace:");
                this.text = TextEditor.replaceLetter(getText(), oldChar, newChar);
                System.out.println(this.text);
                undoManager.addCommand("Replace " + oldChar + " with " + newChar, this.oldText, this.text);
                break;
            case 6:
                this.oldText = this.text;
                this.text = TextEditor.removeSpaces(getText());
                System.out.println(this.text);
                undoManager.addCommand("Removed spaces.", this.oldText, this.text);
                break;
            case 7:
                undoLastCommand();
                break;
            case 8:
                undoManager.showHistory();
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 0 and 9");
        }

        return exit;
    }

    public void inputText() {
        String oldText = this.text;
        System.out.println("Please enter a text:");
        this.text = KeyboardInputHandling.readString("Please enter a text:");
        undoManager.addCommand("Input text.", this.oldText, this.text);
    }

    private void undoLastCommand() {
        Command lastCommand = undoManager.undo();
        if (lastCommand != null) {
            this.text = lastCommand.getOldText();
            System.out.println("Undid: " + lastCommand.getCommand() + ". Back to: " + lastCommand.getOldText());
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void run() {
        boolean exit;
        do {
            exit = optionManager();
        } while (!exit);
    }
}