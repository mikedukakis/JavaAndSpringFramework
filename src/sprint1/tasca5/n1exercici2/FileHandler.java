package sprint1.tasca5.n1exercici2;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class FileHandler {

    static ArrayList<String> fileList = new ArrayList<>();
    static int layer = 0;

    public static ArrayList<String> retrieveFileNames(File[] fileArray) {
        String line;
        String tab = "    ";

        for(int i = 0; i < fileArray.length; i++) {
            Date date = new Date(fileArray[i].lastModified());
            if(fileArray[i].isDirectory()){
                line = tab.repeat(layer) + "[D] " + fileArray[i].getName() + " - " + date;
                fileList.add(line);
                layer++;
                File[] subarray = fileArray[i].listFiles();
                retrieveFileNames(subarray);
                layer--;
            } else {
                line = tab.repeat(layer) + "[F] " + fileArray[i].getName() + " - " + date;
                fileList.add(line);
            }
        }
        return fileList;
    }

    public static void loopThroughArrayList(ArrayList<String> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}