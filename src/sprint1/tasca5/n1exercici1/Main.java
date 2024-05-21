package sprint1.tasca5.n1exercici1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory(".");
        for(File element : dir.listContentsOfDir(dir.getDirPathName())){
            System.out.println(element);
        }
    }
}
