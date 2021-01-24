package abstraction.example1;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {
        //   Vehicle vehicle = new Vehicle();  Abstrakcijos klases objekto negalime sukurti

        Vehicle vehicle = new Vehicle(120) {
            @Override
            public void move() {
                System.out.println("Annonymous inner vehicle implementation. Very rare move case");
            }
        };
        Car car = new Car(150);
        car.move();

        SportCar sportCar = new SportCar(200);
        sportCar.move();

        Vehicle bmw = new Car(100);
        Vehicle audi = new SportCar(150);

        List<Vehicle> masinos = new ArrayList<>();
        masinos.add(bmw);
        masinos.add(audi);
    }
}

