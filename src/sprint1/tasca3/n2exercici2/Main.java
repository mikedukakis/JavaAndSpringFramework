package sprint1.tasca3.n2exercici2;

import sprint1.tasca3.n2exercici1.Restaurant;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<sprint1.tasca3.n2exercici1.Restaurant> restaurants =  new HashSet<>();

        sprint1.tasca3.n2exercici1.Restaurant rest1 = new sprint1.tasca3.n2exercici1.Restaurant("Blue", 5);
        sprint1.tasca3.n2exercici1.Restaurant rest2 = new sprint1.tasca3.n2exercici1.Restaurant("Red", 5);
        sprint1.tasca3.n2exercici1.Restaurant rest3 = new sprint1.tasca3.n2exercici1.Restaurant("Blue", 6);
        sprint1.tasca3.n2exercici1.Restaurant rest4 = new Restaurant("Blue", 5);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);

        System.out.println(restaurants);
    }
}
