package interfaces.example1;

public interface Shape {
    ShapeFormat format = ShapeFormat.TWO_DIMENSIONAL;

    //Trys kontrakto salygos
    void getArea();
    void getPerimeter();
    String getFormat();

    default void print(){
        System.out.println("Shape" + this);
    }
}
