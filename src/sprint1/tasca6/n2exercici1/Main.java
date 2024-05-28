package sprint1.tasca6.n2exercici1;

public class Main {

    public static void main(String[] args) {

        Person pers1 = new Person("Jane", "Doe", (byte)10);
        String str = "Generics!";
        int number = 101;

        GenericMethods.printGenerics(pers1, str, number);

    }

}
