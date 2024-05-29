package sprint1.tasca5.n2exercici1;

import java.io.*;
import java.util.Properties;
import static sprint1.tasca5.n2exercici1.FileHandler.*;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String currentDir = System.getProperty("user.dir");
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
        File txtFile = new File(System.getProperty("user.dir").concat(File.separator).concat(outputFilePath));

        writeToFile(retrieveFileNames(fileArray), txtFile);
    }


}
