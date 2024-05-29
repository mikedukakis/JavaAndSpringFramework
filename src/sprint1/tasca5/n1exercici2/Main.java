package sprint1.tasca5.n1exercici2;

import java.io.File;
import static sprint1.tasca5.n1exercici2.FileHandler.*;

public class Main {

    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughArrayList(retrieveFileNames(fileArray));
    }

}