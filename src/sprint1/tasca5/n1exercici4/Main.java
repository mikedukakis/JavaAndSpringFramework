package sprint1.tasca5.n1exercici4;

import java.io.*;
import static sprint1.tasca5.n1exercici4.FileHandler.*;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());

        File txtFile = new File(System.getProperty("user.dir").concat(File.separator).concat("directoryList.txt"));
        writeToFile(retrieveFileNames(fileArray), txtFile);
        readTxtFile(txtFile);
    }
}
