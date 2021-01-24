package composition.example1;

public class Mouse {

    private boolean isOptical;

    public Mouse(boolean isOptical) {
        this.isOptical = isOptical;
    }

    public boolean isOptical() {
        return isOptical;
    }

    public void setOptical(boolean optical) {
        isOptical = optical;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "isOptical=" + isOptical +
                '}';
    }
}
