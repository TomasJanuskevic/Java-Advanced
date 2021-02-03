package composition.example1;

// composition is achieved when we add other variables in the class that references to other objects

//galima atskkirai manipuliuoti, keisti arba monitor arba mouse klase nepaveikiant Computerset klases.
public class ComputerSet {

    private int totalPrice;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public ComputerSet(int totalPrice, Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this.totalPrice = totalPrice;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public ComputerSet() {
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "ComputerSet{" +
                "totalPrice=" + totalPrice +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                '}';
    }
}
