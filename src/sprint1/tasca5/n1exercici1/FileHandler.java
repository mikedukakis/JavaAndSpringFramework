package sprint1.tasca5.n1exercici1;

import java.io.File;

public class FileHandler {

    public static void loopThroughContent(File[] fileArray) {
        for(File element : fileArray){
            System.out.println(element);
        }
    }
}
