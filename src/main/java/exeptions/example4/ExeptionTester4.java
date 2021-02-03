package exeptions.example4;

public class ExeptionTester4 {

    public static void main(String[] args) {
        int[] skaiciai = new int[10];

        try {
            int daliklis = 3;
            int masyvoElementas = 20;
            int rezultatas = skaiciai[masyvoElementas] / daliklis;
            System.out.println(rezultatas);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Netinkamas masyvo elementas");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Negalima dalinti is 0 arba NULLPOINTERIS");
        } catch (Exception e){
            System.out.println("Bendrine klaida, nezinau kokio tipo");
        }
    }
}
