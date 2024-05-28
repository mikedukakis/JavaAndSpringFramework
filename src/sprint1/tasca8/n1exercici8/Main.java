package sprint1.tasca8.n1exercici8;

public class Main {

    public static void main(String[] args) {

        FunctionalReverse functionalReverse = str -> {
            StringBuilder reversedString = new StringBuilder(str);
            return reversedString.reverse().toString();
        };

        String normal = "Noel sees Leon";
        String reversed = functionalReverse.reverse(normal);

        System.out.println("Let's reverse '" + normal + "': '" + reversed + "'");
    }

}
