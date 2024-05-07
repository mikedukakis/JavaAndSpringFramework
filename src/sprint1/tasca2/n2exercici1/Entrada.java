package sprint1.tasca2.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    private static Scanner keyboardInput = new Scanner(System.in);

    public static int readInt(String question) {
        int intNumber = 0;
        boolean error = true;
        do {
            try {
                intNumber = keyboardInput.nextInt();
                error = false;
            } catch(InputMismatchException e) {
                keyboardInput.nextLine();
                System.out.println("Format error, integer expected");
                System.out.println(question);
            }
        } while (error);
        return intNumber;
    }

    public static byte readByte(String question) {
        byte byteNumber = 0;
        boolean error = true;
        do {
            try {
                byteNumber = keyboardInput.nextByte();
                error = false;
            } catch(InputMismatchException e) {
                keyboardInput.nextLine();
                System.out.println("Format error, byte expected");
                System.out.println(question);
            }
        } while (error);
        return byteNumber;
    }

    public static float readFloat(String question) {
        float floatNumber = 0F;
        boolean error = true;
        do {
            try {
                floatNumber = keyboardInput.nextFloat();
                error = false;
            } catch(InputMismatchException e) {
                keyboardInput.nextLine();
                System.out.println("Format error, float expected");
                System.out.println(question);
            }
        } while (error);
        return floatNumber;
    }

    public static double readDouble(String question) {
        double doubleNumber = 0D;
        boolean error = true;
        do {
            try {
                doubleNumber = keyboardInput.nextDouble();
                error = false;
            } catch(InputMismatchException e) {
                keyboardInput.nextLine();
                System.out.println("Format error, double expected");
                System.out.println(question);
            }
        } while (error);
        return doubleNumber;
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
                System.out.println("Format error, char expected");
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
                if(str.matches(".*[0-9].*") || str.isEmpty()){
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

    public static boolean readBoolean(String question) {
        String input;
        boolean bool = false;
        boolean error = true;
        do {
            try{
                input = keyboardInput.nextLine();
                if(input.charAt(0) == 'y' || input.charAt(0) == 'Y'){
                    bool = true;
                    error = false;
                } else if(input.charAt(0) == 'n' || input.charAt(0) == 'N'){
                    error = false;
                } else {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("Format error, Yes/No expected");
                System.out.println(question);
            }

        } while(error);
        return bool;
    }
}
