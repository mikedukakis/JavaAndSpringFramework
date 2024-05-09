package sprint1.tasca3.n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import static sprint1.tasca2.n2exercici1.Entrada.*;

public class Quiz {
    public static void main(String[] args) {
        File countriesFile =
                new File("C:\\Users\\smcri\\Desktop\\CODE\\JavaAndSpringFramework\\src\\sprint1\\tasca3\\n1exercici3\\countries.txt");
        HashMap<String, String> countryCapital = hashMapFromFile(countriesFile);
        String name = "";
        String country = "";
        String capital = "";
        int score = 0;

        System.out.println("What is your name?");
        name = readString("That is not a name, try again.");
        for (int i = 0; i < 10; i++) {
            if (guessCapital(countryCapital, country, capital)) {
                score++;
            }
        }
        System.out.println(score);
    }

    public static HashMap<String, String> hashMapFromFile(File file) {
        String[] entry;
        HashMap<String, String> hashMap = new HashMap<>();
        try (Scanner fileInput = new Scanner(file)) {
            while (fileInput.hasNextLine()) {
                if (!fileInput.nextLine().isEmpty()) {
                    entry = fileInput.nextLine().split(" ");
                    hashMap.put(entry[0], entry[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
        }

        return hashMap;
    }

    public static String getRandomCountry(HashMap<String, String> hashMap) {
        int randomNum = (int) (Math.ceil(hashMap.keySet().size() * Math.random()));
        Object[] array = hashMap.keySet().toArray();
        String randomCountry = "";
        try {
            randomCountry = (String) array[randomNum];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.fillInStackTrace());
        }

        return randomCountry;
    }

    public static boolean guessCapital(HashMap<String, String> hashMap, String country, String capital) {
        boolean guess = false;
        country = getRandomCountry(hashMap);
        System.out.println("What is the capital of " + country + "?");
        capital = readString("That is not a capital, try again.");

        try {
            if (hashMap.get(country).equals(capital)) {
                System.out.println("Correct!");
                guess = true;
            } else {
                System.out.println("The capital is incorrect. It is " + hashMap.get(country));
            }
        } catch(NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }

        return guess;
    }
}
