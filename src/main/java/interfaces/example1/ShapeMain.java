package interfaces.example1;

import java.util.ArrayList;
import java.util.List;

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

        Shape b = new Circle(5);
        Shape c = new Triangle(5, 8);

        List<Shape> list = new ArrayList<>();
        list.add(b);
        list.add(c);
        System.out.println("-----------------");
        for (Shape shape : list) {
            shape.getArea();
        }
    }

}
