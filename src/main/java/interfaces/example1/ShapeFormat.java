package interfaces.example1;

public enum ShapeFormat {
    TWO_DIMENSIONAL("2D"), THREE_DIMENSIONAL("3D");

    String format;

    ShapeFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return format;
    }
}
