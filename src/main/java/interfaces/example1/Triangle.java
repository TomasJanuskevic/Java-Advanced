package interfaces.example1;

public class Triangle implements Shape {
    private double krastineA;
    private double krastineB;

    public Triangle(double krastineA, double krastineB) {
        this.krastineA = krastineA;
        this.krastineB = krastineB;
    }

    @Override
    public void getArea() {
        double area = krastineA * krastineB / 2;
        System.out.println("Area of triangle is " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = krastineA + krastineA + calculateIstrizaine();
        System.out.println("Perimeter " + perimeter);
    }

    private double calculateIstrizaine() {
        return Math.sqrt(krastineA * krastineA + krastineB * krastineB);
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "krastineA=" + krastineA +
                ", krastineB=" + krastineB +
                '}';
    }
}
