package abstraction.example1;

public class SportCar extends Vehicle{

    public SportCar(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Specific SportCar constructor logic...");
    }

    @Override
    public void move() {
        System.out.println("Move very fast like sport car... ");
    }

    private  void additionalLogic(){
        System.out.println("Additional logic.");
    }
}
