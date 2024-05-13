package sprint1.tasca3.n1exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandling {

    static String countriesPathNames[] = {"src", "sprint1", "tasca3", "n1exercici3", "countries.txt"};
    static File countriesFile = new File(createFilePath(countriesPathNames));
    static String classificacioPathNames[] = {"src", "sprint1", "tasca3", "n1exercici3", "classificacio.txt"};
    static File classificacioFile = new File(createFilePath(classificacioPathNames));
    static HashMap<String, String> countryCapital = hashMapFromFile(countriesFile);

    public static String createFilePath(String[] pathNames) {
        String pathSeparator = File.separator;
        String currentDir = System.getProperty("user.dir");
        String pathName = currentDir + "\\";
        pathName += pathName.join(pathSeparator, pathNames);

        return pathName;
    }

    public static HashMap<String, String> hashMapFromFile(File file) {
        String[] entry;
        HashMap<String, String> hashMap = new HashMap<>();
        try (Scanner fileInput = new Scanner(file)) {
            while (fileInput.hasNextLine()) {
                if (fileInput.hasNextLine()) {
                    entry = fileInput.nextLine().split(" ");
                    hashMap.put(entry[0], entry[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        return hashMap;
    }

    public static boolean createFile(String pathName) {
        boolean bool = false;
        try {
            File classificacio = new File(pathName);
            if (classificacio.createNewFile()) {
                System.out.println("File created: " + classificacio.getName());
                bool = true;
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return bool;
    }

    public static void writeToFile(String name, int score) {
        try (FileWriter fileWriter = new FileWriter(classificacioFile, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Name: " + name + ". Score: " + score + "\n");
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
