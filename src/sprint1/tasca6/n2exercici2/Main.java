package sprint1.tasca6.n2exercici2;

public class Main {

    public static void main(String[] args) {

        Person pers1 = new Person("Jane", "Doe", (byte)10);
        String str = "Generics!";
        char character = 'G';
        int number = 101;

        GenericMethods.printGenerics(number, pers1);
        GenericMethods.printGenerics(pers1, str, character, number);

    }

}
