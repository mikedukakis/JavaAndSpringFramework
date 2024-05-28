package sprint1.tasca8.n1exercici5;

public class Main {

    public static void main(String[] args) {
       PiInterface piInterface = () -> 3.1415;
        System.out.println("Value of pi is " + piInterface.getPiValue());
    }

}
