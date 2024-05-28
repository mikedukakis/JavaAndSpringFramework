package sprint1.tasca7.n1exerici2;

public class RemoteEmployee extends Employee {
    private final float INTERNET_FLAT_RATE;

    public RemoteEmployee(String firstName, String lastName, float hourlyRate) {
        super(firstName, lastName, hourlyRate);
        this.INTERNET_FLAT_RATE = 150;
    }

    public float getINTERNET_FLAT_RATE() {
        return INTERNET_FLAT_RATE;
    }

    @Override
    public float calculateWages(int hours) {
        System.out.print("The wages for " + this.getFirstName() + " " + this.getLastName() + " (remote) are: ");
        return super.calculateWages(hours) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void obsoleteMethod() {
        System.out.println("This RemoteEmployee method is obsolete, beware!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
