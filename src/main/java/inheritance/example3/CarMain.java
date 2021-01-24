package inheritance.example3;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();

        //audi is-a car
        Audi audi = new Audi();
        audi.startCar();

        //volvo is-a car
        Volvo volvo = new Volvo();
        volvo.startCar();

        //polymorphism - daug formu
        // Car gali tureti daugybe formu
        //pvz Audi arba Volvo
        Car audiCar = new Audi();
        audiCar.startCar();
        Car volvoCar = new Volvo();

        List<Audi> cars = new ArrayList<>();
        cars.add(audi);

        List<Car> automobliliai = new ArrayList<>();
        automobliliai.add(audiCar);
        automobliliai.add(volvoCar);
    }
}
