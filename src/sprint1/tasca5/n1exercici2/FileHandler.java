package sprint1.tasca5.n1exercici2;

import java.io.File;
import java.util.Date;

public class FileHandler {

    public static void loopThroughContent(File[] fileArray) {
        int i = 0;
        for(File element : fileArray){
            Date d = new Date(element.lastModified());
            String[] pathArray = arrayFromPath(element);
            loopThroughArray(pathArray);
            if(element.isDirectory()){
                System.out.println(element + "(D) " + d);
                File[] subArray = element.listFiles();
                loopThroughContent(subArray);
            } else {
                System.out.println(element + "(F)" + d);
            }
            i++;
        }
    }

    public static String[] arrayFromPath(File file) {
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);
        String[] arrayPath = filePath.split("\\\\");
        return arrayPath;
    }

    public static void loopThroughArray(String[] array) {
        for(String element : array){
            System.out.println(element);
        }
    }
}
