package sprint1.tasca5.n2exercici1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void loopThroughContent(File[] fileArray, String outputFilePath) {
        for (File element : fileArray) {
            if (element.isDirectory()) {
                writeToFile(element + "(D)", outputFilePath);
                File[] subArray = element.listFiles();
                loopThroughContent(subArray, outputFilePath);
            } else {
                writeToFile(element + "(F)", outputFilePath);
            }
        }
    }

    public static void writeToFile(String str, String outputFilePath) {
        try (FileWriter fileWriter = new FileWriter(outputFilePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(str + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to file");
            e.printStackTrace();
        }
    }

}
