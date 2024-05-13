package sprint1.tasca3.n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants =  new HashSet<>();

        Restaurant rest1 = new Restaurant("Blue", 5);
        Restaurant rest2 = new Restaurant("Red", 5);
        Restaurant rest3 = new Restaurant("Blue", 6);
        Restaurant rest4 = new Restaurant("Blue", 5);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);

        System.out.println(restaurants);
    }
}
