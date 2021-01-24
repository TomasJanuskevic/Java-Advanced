package composition.example1;

public class Keyboard {
    private int price;
    private String brand;

    public Keyboard(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
// Keyboard specific behavior
    //SINGLE RESPONSIBILITY
}
