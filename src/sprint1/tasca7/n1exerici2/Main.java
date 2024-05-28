package sprint1.tasca7.n1exerici2;

public class Main {

    public static void main(String[] args) {
        OfficeEmployee.setFuel((float)125);
        OfficeEmployee emp1 = new OfficeEmployee("Jane", "Doe", (float)12.5);
        RemoteEmployee emp2 = new RemoteEmployee("John", "Doe", (float)12.5);
        Employee emp3 = new Employee("Joan", "Petit", (float)12);

        emp1.obsoleteMethod();
        emp2.obsoleteMethod();
    }
}
