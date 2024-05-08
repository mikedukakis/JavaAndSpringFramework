package sprint1.tasca2.n3exercici1;

import static sprint1.tasca2.n2exercici1.Entrada.*;
import static sprint1.tasca2.n3exercici1.Cine.*;

public class Principal {

    public static void main(String[] args) {
        int rows = 0;
        int seat = 0;
//        Scanner entradaTeclat = new Scanner(System.in);

        rows = readInt("How many rows are there?");
        seat = readInt("How many seats per row?")
        Cine cine = new Cine()
        iniciar();

    }

    public static byte menu() {
        Scanner keyboardInput = new Scanner(System.in);
        byte option = 0;
        String menu =
            "1.- Mostrar totes les butaques reservades.\n" +
            "2.- Mostrar les butaques reservades per una persona.\n" +
            "3.- Reservar una butaca.\n" +
            "4.- Anul·lar la reserva d’una butaca.\n" +
            "5.- Anul·lar totes les reserves d’una persona.\n" +
            "0.- Sortir.\n";
        do {
            option = Entrada.readByte(menu);
            if(option < 0 || option > 5){
                System.out.println("Please enter an integer from 0 to 5");
            }
        } while(option < 0 || option > 5);
        return option;
    }

}
