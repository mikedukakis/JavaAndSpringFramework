package sprint1.tasca7.n1exerici1;

public class OfficeEmployee extends Employee{
    private static float fuel;

    public OfficeEmployee(String firstName, String lastName, float hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    public static float getFuel() {
        return fuel;
    }

    public static void setFuel(float fuel) {
        OfficeEmployee.fuel = fuel;
    }

    @Override
    public float calculateWages(int hours) {
        System.out.print("The wages for " + this.getFirstName() + " " + this.getLastName() + " (office) are: ");
        return super.calculateWages(hours) + fuel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
