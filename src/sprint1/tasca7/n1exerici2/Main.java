package sprint1.tasca7.n1exerici2;

public class Main {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        OfficeEmployee.setFuel((float)125);
        OfficeEmployee emp1 = new OfficeEmployee("Jane", "Doe", (float)12.5);
        RemoteEmployee emp2 = new RemoteEmployee("John", "Doe", (float)12.5);

        emp1.obsoleteMethod();
        emp2.obsoleteMethod();
    }
}
