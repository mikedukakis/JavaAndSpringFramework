package sprint1.tasca4.n1exercici1;

import java.util.ArrayList;

public class Months {
    // Attributes
    private ArrayList<String> months;

    // Constructor
    public Months() {
        this.months = new ArrayList<>();
        this.months.add("January");
        this.months.add("February");
        this.months.add("March");
        this.months.add("April");
        this.months.add("May");
        this.months.add("June");
        this.months.add("July");
        this.months.add("August");
        this.months.add("September");
        this.months.add("October");
        this.months.add("November");
        this.months.add("December");
    }

    // Getters & Setters
    public ArrayList<String> getMonths() {
        return months;
    }

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }
}
