package sprint1.tasca5.n1exercici5;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jane Doe", (byte)25, "Java I");
        File file = new File("student.ser");

        FileHandler.serialize(file, student);

        FileHandler.deSerialize(file);
    }
}
