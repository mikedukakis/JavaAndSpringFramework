package sprint1.tasca5.n1exercici4;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    public static void loopThroughContent(File[] fileArray) {
        for(File element : fileArray){
            if(element.isDirectory()){
                writeToFile(element + "(D)");
                File[] subArray = element.listFiles();
                loopThroughContent(subArray);
            } else {
                writeToFile(element + "(F)");
            }
        }
    }

    public static void writeToFile(String str) {
        try (FileWriter fileWriter = new FileWriter("directoryList.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(str + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to file");
            e.printStackTrace();
        }
    }

    public static void readTxt(File file) {
        try(Scanner fileInput = new Scanner(file)) {
            while(fileInput.hasNextLine()){
                System.out.println(fileInput.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
