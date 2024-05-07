package sprint1.tasca2.n1exercici1;

import java.util.ArrayList;

class Shop {

    public static void main (String[] args) {
        // Create new sale (empty of products)
        Sale sale1 = new Sale();
        // Trigger and catch own exception
        try{
            System.out.println(sale1.calculateTotal());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Create 3 product objects
        Product article1 = new Product("article1", 99.99F);
        Product article2 = new Product("article2", 89.99F);
        Product article3 = new Product("article3", 149.99F);
        // Add them to products collection
        sale1.getProducts().add(article1);
        sale1.getProducts().add(article2);
        sale1.getProducts().add(article3);

        // Calculate now price (collection is not empty, so exception is not raised)
        try{
            System.out.println(sale1.calculateTotal());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Trigger and catch ArrayIndexOutOfBoundsException exception
        try {
            outOfBounds();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    // Create new method to raise ArrayIndexOutOfBoundsException
    public static void outOfBounds() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Array index out of bounds exception raised");
    }

}