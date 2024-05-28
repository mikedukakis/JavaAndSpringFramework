package sprint1.tasca6.n2exercici2;

public class GenericMethods {

    public static <T> void printGenerics(T... args) {
        System.out.println("Printing with generic variable arguments:");
        for(T arg : args) {
            System.out.println(arg);
        }
    }

}
