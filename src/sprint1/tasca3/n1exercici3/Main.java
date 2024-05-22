package sprint1.tasca3.n1exercici3;

public class Main {

    public static void main(String[] args) {
        String name;
        int score;

        name = Quiz.getName();
        score = Quiz.guessCapital(FileHandling.countryCapital, Quiz.getRandomCountries(FileHandling.countryCapital));
        FileHandling.createFile(FileHandling.classificacioFile.toString());
        FileHandling.writeToFile(name, score);
    }

}
