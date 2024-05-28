package sprint1.tasca7.n1exerici2;

public class Employee {
    private String firstName;
    private String lastName;
    private float hourlyRate;

    public Employee(String firstName, String lastName, float hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float calculateWages(int hours){
        System.out.print("The wages for " + this.getFirstName() + " " + this.getLastName() + " (superclass) are: ");
        return hours * this.hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
