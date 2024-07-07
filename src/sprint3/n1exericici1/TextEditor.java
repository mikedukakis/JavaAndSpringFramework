package sprint3.n1exericici1;

public class TextEditor {

    public static String toUpperCase(String text) {
        System.out.println("Text changed to uppercase");
        return text.toUpperCase();
    }

    public static String toLowerCase(String text) {
        System.out.println("Text changed to lowercase");
        return text.toLowerCase();
    }

    public static String removeLetter(String text, String oldChar) {
        System.out.println("Removed all '" + oldChar + "' from text");
        return text.replaceAll(oldChar, "");
    }

    public static String replaceLetter(String text, char oldChar, char newChar) {
        System.out.println("Replaced '" + oldChar + "' with '" + newChar + "'");
        return text.replace(oldChar, newChar);
    }

    public static String removeSpaces(String text) {
        System.out.println("Removed all spaces");
        return text.replace(" ", "");
    }
}
