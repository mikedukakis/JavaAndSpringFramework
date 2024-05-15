package sprint1.tasca3.n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListExercise {

    public static void main(String[] args) {
        List<Integer> firstList = createIntList(1, 10);

        System.out.println("First List of Integers: " + firstList);

        List<Integer> secondList = reverseIntList(firstList);

        System.out.println("Second List of Integers (first List reversed): " + secondList);

    }

    public static List<Integer> createIntList(int lowestValue, int highestValue) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for(int i = lowestValue; i < highestValue; i++) {
            listOfIntegers.add(i);
        }
        return listOfIntegers;
    }

    public static List<Integer> reverseIntList(List<Integer> integerList) {
        List<Integer> reversedList = new ArrayList<>();
        ListIterator<Integer> iter = integerList.listIterator();
        while(iter.hasNext()){
            iter.next();
        }
        while(iter.hasPrevious()){
            reversedList.add(iter.previous());
        }
        return reversedList;
    }
}
