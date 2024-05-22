package sprint1.tasca5.n2exercici1;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        String configPath = currentDir + "\\src\\sprint1\\tasca5\\n2exercici1\\config.properties";
        try (FileInputStream fileInputStream = new FileInputStream(configPath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dirPathName = properties.getProperty("dirPathName");
        String outputFilePath = properties.getProperty("outputFilePath");

        Directory dir = new Directory(dirPathName);
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughContent(fileArray, outputFilePath);
    }

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
