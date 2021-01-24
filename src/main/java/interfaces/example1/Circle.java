package interfaces.example1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area = " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + perimeter);
    }

    @Override
    public String getFormat() {
        return Shape.format.toString();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
