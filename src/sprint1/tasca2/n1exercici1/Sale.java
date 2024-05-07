package sprint1.tasca2.n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private float totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float calculateTotal() throws EmptySaleException{
        float total = 0F;
        if(products.isEmpty()){
            throw new EmptySaleException("To process a sale you need to add products first");
        } else {
            for (Product product : products) {
                total += product.getPrice();
            }
        }
        return total;
    }
}
