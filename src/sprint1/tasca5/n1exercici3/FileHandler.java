package sprint1.tasca5.n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

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

    public static void writeToFile(ArrayList<String> arrayList, File file) {
        try (FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for(String element : arrayList){
                bufferedWriter.write(element + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to file");
            e.printStackTrace();
        }
    }

}