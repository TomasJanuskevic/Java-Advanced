package interfaces.example1;

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle(8);
        circle.getArea();
        circle.getPerimeter();
        circle.print();

        Triangle triangle = new Triangle(5, 8);
        triangle.getArea();
        triangle.getPerimeter();
        triangle.print();
    }

}
