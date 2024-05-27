package sprint1.tasca5.n1exercici5;

import java.io.*;

public class FileHandler {

    public static void serialize(File file, Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deSerialize(File file) {
        Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            student = (Student) ois.readObject();
        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        System.out.println(student);
    }
}
