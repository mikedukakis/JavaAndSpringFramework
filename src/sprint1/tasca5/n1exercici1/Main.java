package sprint1.tasca5.n1exercici1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Directory dir = new sprint1.tasca5.n1exercici1.Directory(".");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        FileHandler.loopThroughContent(fileArray);
    }
}
