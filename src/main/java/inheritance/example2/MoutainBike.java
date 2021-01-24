package inheritance.example2;

//IS-A -  MoutainBike IS-A Bicycle

public class MoutainBike extends Bicycle {

    //MoutainBike specific atribute
    public int seatHeight;

    public MoutainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public void commonBicycleBehavior() {
       // super.commonBicycleBehavior(); tevines klases elgesys
        System.out.println("Vaziuoju kaip kalnu dviratis");
    }

    @Override
    public String toString() {
        return "MoutainBike{" +
                "gear=" + gear +
                ", speed=" + speed +
                ", seatHeight=" + seatHeight +
                '}';
    }
}

