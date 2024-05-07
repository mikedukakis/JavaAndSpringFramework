package sprint1.tasca3.n1exercici1;

public class Month {
    // Attributes
    private String name;

    // Constructors
    public Month(String name) {
        this.name = name;
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Own Methods
    public String toString() {
        return "Month: " + this.name;
    }

}
