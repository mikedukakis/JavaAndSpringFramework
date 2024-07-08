package sprint3.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInputHandling {
    private static final Scanner KEYBOARD_INPUT = new Scanner(System.in);

    public static int readInt(String question) {
        int intNumber = 0;
        boolean error = true;
        do {
            try {
                intNumber = KEYBOARD_INPUT.nextInt();
                KEYBOARD_INPUT.nextLine();
                error = false;
            } catch(InputMismatchException e) {
                KEYBOARD_INPUT.nextLine();
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
                input = KEYBOARD_INPUT.nextLine();
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
                str = KEYBOARD_INPUT.nextLine();
                if(str.isEmpty()){
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
