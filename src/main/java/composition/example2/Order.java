package composition.example2;

import java.util.List;

public class Order {

    private List<Product> products;

    public Order(List<Product> priducts) {
        this.products = priducts;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "priducts=" + products +
                '}';
    }
}
