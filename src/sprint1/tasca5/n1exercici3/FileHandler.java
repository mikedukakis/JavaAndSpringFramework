package sprint1.tasca5.n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class FileHandler {

    static ArrayList<String> fileList = new ArrayList<>();

    public static ArrayList<String> retrieveFileNames(File[] fileArray) {
        String line;
        for(int i = 0; i < fileArray.length; i++) {
            Date date = new Date(fileArray[i].lastModified());
            if(fileArray[i].isDirectory()){
                line = fileArray[i] + " [D]" + " - " + date;
                fileList.add(line);
                File[] subArray = fileArray[i].listFiles();
                retrieveFileNames(subArray);
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

    public static void createTree(ArrayList<String> arrayList) {
        String branch;
        String tab = "---";
        for(String element : arrayList){
            String[] pathArray = stringArrayFromPath(element);
            int arrayLength = pathArray.length;
            branch = tab.repeat(arrayLength - 1) + pathArray[arrayLength - 1];
            writeToFile(branch, new File("directoryList.txt"));
        }
    }

    public static void writeToFile(String str, File file) {
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(str + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to file");
            e.printStackTrace();
        }
    }
}
