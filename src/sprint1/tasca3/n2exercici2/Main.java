package sprint1.tasca3.n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants =  new HashSet<>();

        Restaurant rest1 = new Restaurant("ABC", 9);
        Restaurant rest2 = new Restaurant("Beta", 8);
        Restaurant rest3 = new Restaurant("ABC", 8);
        Restaurant rest4 = new Restaurant("Beta", 10);
        Restaurant rest5 = new Restaurant("Choco", 9);
        Restaurant rest6 = new Restaurant("ABC", 9);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);
        restaurants.add(rest5);
        restaurants.add(rest6); // Repeated, will not be added

        System.out.println("HashSet restaurants:\n" + restaurants);

        System.out.println("Sorted restaurants (with TreeSet):\n" + sortWithTreeSet(restaurants));

        System.out.println("Sorted restaurants (with Collections.sort):\n" + sortWithCollectionsSort(restaurants));
    }

    public static TreeSet<Restaurant> sortWithTreeSet(HashSet<Restaurant> hashSet) {
        TreeSet<Restaurant> treeFromHash = new TreeSet<>(hashSet);
        return treeFromHash;
    }

    public static ArrayList<Restaurant> sortWithCollectionsSort(HashSet<Restaurant> hashSet) {
        ArrayList<Restaurant> arrayListFromHash = new ArrayList<>(hashSet);
        Collections.sort(arrayListFromHash);
        return arrayListFromHash;
    }
}
