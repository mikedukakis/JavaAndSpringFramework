package sprint1.tasca5.n2exercici1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class FileHandler {

    private static ArrayList<String> fileList;
    private static int layer;

    public static ArrayList<String> retrieveFileNames(File[] fileArray) {
        String line;
        String tab = "    ";

        if (fileList == null) {
            fileList = new ArrayList<>();
            layer = 0;
        }

        for (File file : fileArray) {
            Date date = new Date(file.lastModified());
            if (file.isDirectory()) {
                line = tab.repeat(layer) + "[D] " + file.getName() + " - " + date;
                fileList.add(line);
                layer++;
                File[] subarray = file.listFiles();
                retrieveFileNames(subarray);
                if (layer > 1) {
                    layer--;
                }
            } else {
                line = tab.repeat(layer) + "[F] " + file.getName() + " - " + date;
                fileList.add(line);
            }
        }
        return fileList;
    }

    public static void writeToFile(ArrayList<String> arrayList, File file) {
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String element : arrayList) {
                bufferedWriter.write(element + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to file");
            e.printStackTrace();
        }
    }

}