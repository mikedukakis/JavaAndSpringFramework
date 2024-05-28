package sprint1.tasca5.n1exercici2;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class FileHandler {

    static ArrayList<String> fileList = new ArrayList<>();

    public static ArrayList<String> retrieveFileNames(File[] fileArray) {
        String line;
        for(int i = 0; i < fileArray.length; i++) {
            Date date = new Date(fileArray[i].lastModified());
            if(fileArray[i].isDirectory()){
                line = fileArray[i] + " [D]" + " - " + date;
                fileList.add(line);
                File[] subarray = fileArray[i].listFiles();
                retrieveFileNames(subarray);
            } else {
                line = fileArray[i] + " [F]" + " - " + date;
                fileList.add(line);
            }
        }
        return fileList;
    }

    public static String[] stringArrayFromPath(String path){
        return path.split("\\\\");
    }

    public static ArrayList<String> createTree(ArrayList<String> arrayList) {
        ArrayList<String> fileListClean = new ArrayList<>();
        String branch;
        String tab = "   ";
        for(String element : arrayList){
            String[] pathArray = stringArrayFromPath(element);
            int arrayLength = pathArray.length;
            branch = tab.repeat(arrayLength - 1) + pathArray[arrayLength - 1];
            fileListClean.add(branch);
        }
        return fileListClean;
    }
}