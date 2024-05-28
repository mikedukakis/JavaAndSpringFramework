package sprint1.tasca7.n1exerici1;

public class Main {

    public static void main(String[] args) {
        OfficeEmployee.setFuel((float)125);
        Employee emp1 = new OfficeEmployee("Jane", "Doe", (float)12.5);
        Employee emp2 = new RemoteEmployee("John", "Doe", (float)12.5);
        Employee emp3 = new Employee("Joan", "Petit", (float)12);

        System.out.println(emp1.calculateWages(160));
        System.out.println(emp2.calculateWages(155));
        System.out.println(emp3.calculateWages(165));
    }
}
