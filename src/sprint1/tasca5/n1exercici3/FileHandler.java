package sprint1.tasca5.n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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
}
