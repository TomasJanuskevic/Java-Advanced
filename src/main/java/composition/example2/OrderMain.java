package composition.example2;

//Uzsakymas ORDER gali egzistuoti ir be produktu
// JEigu turin 5 prioduktus ir juos panaikinam , orderis vistiek egzistuoja

import java.util.ArrayList;
import java.util.List;

public class OrderMain {


    public static void main(String[] args) {
        Product product1 = new Product("Kede", 5, 50);
        Product product2 = new Product("Stalas", 3, 150);

        List<Product> produktai = new ArrayList<>();
        produktai.add(product1);
        produktai.add(product2);

        Order order = new Order(produktai);

        System.out.println(order);
        order.getProducts().get(0).setQuantity(2);
        System.out.println(order);

        for (Product product : produktai) {
            if(product.getProductName().equals("Kede")){
                order.getProducts().remove(product);
            }
        }
    }

}
