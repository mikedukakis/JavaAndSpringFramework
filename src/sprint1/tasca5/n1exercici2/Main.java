package sprint1.tasca5.n1exercici2;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Directory dir = new Directory("..");
        File[] fileArray = dir.listContentsOfDir(dir.getDirPathName());
        loopThroughArrayList(FileHandler.createTree(FileHandler.retrieveFileNames(fileArray)));
    }

    public static void loopThroughArrayList(ArrayList<String> arrayList) {
        for(int i = 1; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}