package sprint1.tasca3.n1exercici3;

import java.io.File;
import java.util.*;

public class Quiz {

    static Scanner keyboardInput = new Scanner(System.in);
    private static final int NUMBER_OF_QUESTIONS = 10;

    public static void main(String[] args) {
        String name;
        int score;

        name = getName();
        score = guessCapital(FileHandling.countryCapital, getRandomCountries(FileHandling.countryCapital));
        FileHandling.createFile(FileHandling.outPathName);
        FileHandling.writeToFile(name, score);
    }

    public static String getName() {
        String name;
        boolean correct = false;
        do {
            System.out.println("What is your name?");
            name = keyboardInput.nextLine();
            if (name.isEmpty()) {
                System.out.println("Not a valid name");
            } else {
                correct = true;
            }
        } while (!correct);
        return name;
    }

    public static int[] listOfRandomInts(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

        return array;
    }


    public static int guessCapital(HashMap<String, String> hashMap, String[] array) {
        String shownCountry;
        String capital;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            shownCountry = array[i];
            System.out.println("What is the capital of " + shownCountry + "?");
            capital = keyboardInput.nextLine();
            if(correctGuess(hashMap, shownCountry, capital)){
                counter++;
            }
        }
        return counter;
    }

    public static boolean correctGuess(HashMap<String, String> hashMap, String country, String capital) {
        boolean guess = false;
        if (hashMap.get(country).equalsIgnoreCase(capital)) {
            System.out.println("Correct!");
            guess = true;
        } else {
            System.out.println("Wrong answer. The capital is " + hashMap.get(country));
        }
        return guess;
    }

    public static String[] getRandomCountries(HashMap<String, String> hashMap) {
        int[] array = listOfRandomInts(hashMap.size());
        String randomCountry;
        String[] randomCountries =  new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            randomCountry = hashMap.keySet().toArray()[array[i]].toString();
            randomCountries[i] = randomCountry;
        }

        return randomCountries;
    }
}
