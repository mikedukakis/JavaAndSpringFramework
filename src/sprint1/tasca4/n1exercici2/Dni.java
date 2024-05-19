package sprint1.tasca4.n1exercici2;

public class Dni {
    private int number;
    private char letter;

    public Dni(int number) {
        this.number = number;
        this.letter = getLetter(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public static char getLetter(int dni) {
        String officialLetters;
        int letterIndex;
        char letter;

        officialLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
        letterIndex = dni % 23;
        letter = officialLetters.charAt(letterIndex);

        return letter;
    }

}
