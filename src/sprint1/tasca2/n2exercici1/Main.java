package sprint1.tasca2.n2exercici1;

import static sprint1.tasca2.n2exercici1.Entrada.*;

public class Main {

    public static void main(String[] args) {
        // Integer test
        int intNumber;
        String ageQuestion = "Please enter your age:";
        System.out.println(ageQuestion);
        intNumber = readInt(ageQuestion);
        System.out.println("Your age is " + intNumber);

        // Byte test
        byte byteNumber;
        System.out.println(ageQuestion);
        byteNumber = readByte(ageQuestion);
        System.out.println("Your age is " + byteNumber);

        // Float test
        float floatNumber;
        String piQuestion = "Approximate value of pi:";
        System.out.println(piQuestion);
        floatNumber = readFloat(piQuestion);
        System.out.println("Pi is approximately " + floatNumber);

        // Double test
        double doubleNumber;
        System.out.println(piQuestion);
        doubleNumber = readDouble(piQuestion);
        System.out.println("Pi is approximately " + doubleNumber);

        // Char test
        char character;
        String charQuestion = "Write one character:";
        System.out.println(charQuestion);
        character = readChar(charQuestion);
        System.out.println("You wrote the character '" + character + "'");

        // String test
        String str;
        String stringQuestion = "What's your name?";
        System.out.println(stringQuestion);
        str = readString(stringQuestion);
        System.out.println("Your name is '" + str + "'");

        // Boolean test
        boolean bool;
        String booleanQuestion = "Is it true? [Yes/No]";
        System.out.println(booleanQuestion);
        bool = readBoolean(booleanQuestion);
        System.out.println("It is " + bool);
    }

}
