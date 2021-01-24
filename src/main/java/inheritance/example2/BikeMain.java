package inheritance.example2;

public class BikeMain {



    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5,8); // Has only bicycle functionality
        System.out.println(bicycle);

        MoutainBike moutainBike = new MoutainBike(10,9, 6); // has bicycle and mountainbike functionality
        System.out.println(moutainBike);

        boolean isBicycleIsABicycle = bicycle instanceof Bicycle;
        System.out.println(isBicycleIsABicycle);
        boolean isMoutainBikeIsABicycle = moutainBike instanceof Bicycle;
        System.out.println(isMoutainBikeIsABicycle);

    }
}
