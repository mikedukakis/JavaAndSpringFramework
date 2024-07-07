package sprint3.n1exericici1;

public class Command {
    private String command;
    private String oldText;
    private String currentText;

    public Command(String command, String oldText, String currentText) {
        this.command = command;
        this.oldText = oldText;
        this.currentText = currentText;
    }

    public String getCommand() {
        return command;
    }

    public String getOldText() {
        return oldText;
    }

    public String getCurrentText() {
        return currentText;
    }
}

