package sprint1.tasca5.n1exercici2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughContent(fileArray);
    }

    public static void loopThroughContent(File[] fileArray) {
        for(File element : fileArray){
            if(element.isDirectory()){
                System.out.println(element + "(D)");
                File[] subArray = element.listFiles();
                loopThroughContent(subArray);
            } else {
                System.out.println(element + "(F)");
            }
        }
    }
}
