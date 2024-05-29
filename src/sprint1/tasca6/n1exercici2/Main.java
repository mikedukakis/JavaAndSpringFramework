package sprint1.tasca6.n1exercici2;

public class Main {

    public static void main(String[] args) {

        Person pers1 = new Person("Jane", "Doe", (byte)10);
        String str = "Generics!";
        char character = 'G';

        System.out.println("1st test");
        GenericMethods.printGenerics(pers1, str, character);
        System.out.println("---");
        System.out.println("2nd test");
        GenericMethods.printGenerics(str, character, pers1);

    }

}
