package sprint1.tasca5.n1exercici1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        sprint1.tasca5.n1exercici2.Directory dir = new sprint1.tasca5.n1exercici2.Directory(".");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughContent(fileArray);

    }

    public static void loopThroughContent(File[] fileArray) {
        for(File element : fileArray){
            System.out.println(element);
        }
    }
}
