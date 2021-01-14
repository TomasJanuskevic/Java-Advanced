package encapsulation.example2;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(50);
        System.out.println("Kiseneje: " + pocket.showMoney() + " eur");
        pocket.setMoney(50);
        System.out.println("Dabar kiseneje yra " + pocket.showMoney() + " eur");
        pocket.setMoney(-10);
        pocket.setMoney(3001);
        pocket.getMoney(80);
        System.out.println("Dabar kiseneje liko " + pocket.showMoney() + " eur");
        pocket.getMoney(15);
        pocket.showMoney();
    }
}
