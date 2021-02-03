package generics.example2;

import java.util.List;

//operate with object type T which extends class Vehicle
public class Garage<T extends Vehicle> {

    final List<T> differentCars;

    public Garage(List<T> differentCars) {
        this.differentCars = differentCars;
    }

    public List<T> getDifferentCars() {
        return differentCars;
    }

    public void repairVehicle(Vehicle vehicle){
        System.out.println("Repair..." + vehicle.color + " " + vehicle.brand);
    }
}
