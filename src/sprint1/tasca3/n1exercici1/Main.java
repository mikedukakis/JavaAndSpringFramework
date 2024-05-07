package sprint1.tasca3.n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        months.add(january); // 0
        months.add(february); // 1
        months.add(march); // 2
        months.add(april); // 3
        months.add(may); // 4
        months.add(june); // 5
        months.add(july); // 6
        months.add(september); // 7
        months.add(october); // 8
        months.add(november); // 9
        months.add(december); // 10

        months.add(7, august);

        HashSet<Month> monthsHS = new HashSet<>();

        System.out.println("August fits into index 7 (8th element)");
        for(Month month : months) {
            System.out.println(month.toString());
            monthsHS.add(month);
        }

        System.out.println("Looping through HashSet with for");
        for(Month month : monthsHS) {
            System.out.println(month.toString() + ", ");
        }

        System.out.println("Looping through HashSet with Iterator");
        Iterator<Month> iter = monthsHS.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
