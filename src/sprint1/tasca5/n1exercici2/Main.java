package sprint1.tasca5.n1exercici2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughContent(fileArray, dir);
    }

    public static void loopThroughContent(File[] fileArray, Directory dir) {
        for(File element : fileArray){
            System.out.println(element);
            if(element.isDirectory()){
                File[] subArray = element.listFiles();
                loopThroughContent(subArray, dir);
            }
        }
    }
}
