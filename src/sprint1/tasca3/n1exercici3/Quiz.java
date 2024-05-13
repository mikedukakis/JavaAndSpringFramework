package sprint1.tasca3.n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//import static sprint1.tasca2.n2exercici1.Entrada.*;

public class Quiz {

    static File countriesFile =
            new File("C:\\Users\\smcri\\Desktop\\CODE\\JavaAndSpringFramework\\src\\sprint1\\tasca3\\n1exercici3\\countries.txt");
    static HashMap<String, String> countryCapital = hashMapFromFile(countriesFile);
    static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        String name = "";
        String country = "";
        String capital = "";

        name =  getName();
        System.out.println(keepCount(10));
    }

    public static String getName() {
        String name = "";
        boolean correct = false;
        do {
            System.out.println("What is your name?");
            name = keyboardInput.nextLine();
            if(name.isEmpty()){
                System.out.println("Not a valid name");
            } else {
                correct = true;
            }
        } while(!correct);
        return name;
    }

    public static int[] listOfRandomInts(int size) {
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
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

    public static boolean guessCapital(HashMap<String, String> hashMap) {
        boolean guess = false;
        String shownCountry;
        String capital;
        shownCountry = getRandomCountry(hashMap);
        System.out.println("What is the capital of " + shownCountry + "?");
        capital = keyboardInput.nextLine();

        try {
            if (hashMap.get(shownCountry).equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                guess = true;
            } else {
                System.out.println("Wrong answer. The capital is " + hashMap.get(shownCountry));
            }
        } catch(NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }

        return guess;
    }

    public static int keepCount(HashMap<String, String> hashMap, int counter) {
        int score = 0;
        int[] array = listOfRandomInts(hashMap.size());
        String randomCountry = "";
        for (int i = 0; i < counter; i++) {
            if (guessCapital(countryCapital)) {
                score++;
            }
        }
        return score;
    }

    public static String getRandomCountry(HashMap<String, String> hashMap, int numberOfQuestions) {
        int[] array = listOfRandomInts(hashMap.size());
        String randomCountry = "";
        for(int i = 0; i < numberOfQuestions; i++){

        }
        randomCountry = hashMap.keySet().toArray()[array[0]].toString();

        return randomCountry;
    }
}
