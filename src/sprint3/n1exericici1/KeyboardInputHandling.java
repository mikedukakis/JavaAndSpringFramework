package sprint3.n1exericici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInputHandling {
    private static Scanner keyboardInput = new Scanner(System.in);

    public static int readInt(String question) {
        int intNumber = 0;
        boolean error = true;
        do {
            try {
                intNumber = keyboardInput.nextInt();
                keyboardInput.nextLine();
                error = false;
            } catch(InputMismatchException e) {
                keyboardInput.nextLine();
                System.out.println("Format error, integer expected");
                System.out.println(question);
            }
        } while (error);
        return intNumber;
    }

    public static char readChar(String question) {
        char character = ' ';
        String input;
        boolean error = true;
        do {
            try {
                input = keyboardInput.nextLine();
                if(input.length() == 1) {
                    character = input.charAt(0);
                    error = false;
                } else {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("Format error, character expected");
                System.out.println(question);
            }
        } while (error);
        return character;
    }

    public static String readString(String question) {
        String str = "";
        boolean error = true;
        do {
            try{
                str = keyboardInput.nextLine();
                if(str.matches("[0-9]+") || str.isEmpty()){
                    throw new Exception();
                } else {
                    error = false;
                }
            } catch(Exception e) {
                System.out.println("Format error, string expected");
                System.out.println(question);
            }
        } while(error);
        return str;
    }

}
