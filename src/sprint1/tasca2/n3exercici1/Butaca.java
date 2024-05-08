package sprint1.tasca2.n3exercici1;

import java.util.Objects;

public class Butaca {
    // Attributes
    private int row;
    private int seat;
    private String customer;

    // Constructors
    public Butaca(int row, int seat, String customer) {
        this.row = row;
        this.seat = seat;
        this.customer = customer;
    }

    // Getters & Setters
    public int getRow() {
        return this.row;
    }

    public int getSeat() {
        return this.seat;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    // Own methods
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Butaca butaca = (Butaca) o;
        return this.row == butaca.row && this.seat == butaca.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seat);
    }

    @Override
    public String toString(){
        return "Fila: " + this.row + ", Seient: " + this.seat + ", Persona: " + this.customer;
    }

}
