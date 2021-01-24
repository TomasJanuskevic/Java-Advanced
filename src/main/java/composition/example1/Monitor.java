package composition.example1;

public class Monitor {
    private int displaySize;

    public Monitor(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "displaySize=" + displaySize +
                '}';
    }
}
