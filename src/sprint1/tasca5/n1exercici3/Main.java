package sprint1.tasca5.n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughContent(fileArray);
    }

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
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
