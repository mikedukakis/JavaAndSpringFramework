package sprint3.n1exericici1;

import java.util.Stack;

public class Undo {
    private Stack<Command> commandHistory;
    private static Undo instance;

    private Undo() {
        commandHistory = new Stack<>();
    }

    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command, String oldText, String currentText) {
        commandHistory.push(new Command(command, oldText, currentText));
    }

    public Command undo() {
        if (!commandHistory.isEmpty()) {
            return commandHistory.pop();
        }
        return null;
    }

    public void showHistory() {
        if (commandHistory.isEmpty()) {
            System.out.println("No commands in history.");
        } else {
            System.out.println("Command History:");
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ". " + commandHistory.get(i).getCommand());
            }
        }
    }

    public boolean hasHistory() {
        return !commandHistory.isEmpty();
    }
}
