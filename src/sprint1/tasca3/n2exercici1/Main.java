package sprint1.tasca3.n2exercici1;

import java.util.HashSet;

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
        restaurants.add(rest6);

        System.out.println(restaurants);
    }
}
