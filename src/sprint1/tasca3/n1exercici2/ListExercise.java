package sprint1.tasca3.n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListExercise {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        for(int i = 1; i < 11; i++) {
            firstList.add(i);
        }
        System.out.println("First List of Integers: " + firstList);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> iter = firstList.listIterator();
        while(iter.hasNext()){
            iter.next();
        }
        while(iter.hasPrevious()){
            secondList.add(iter.previous());
        }

        System.out.println("Second List of Integers (first List reversed): " + secondList);

    }
}
