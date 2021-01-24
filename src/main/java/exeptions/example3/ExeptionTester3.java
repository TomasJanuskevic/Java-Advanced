package exeptions.example3;

public class ExeptionTester3 {
    public static void main(String[] args) {
        int[] masyvas = {1, 2};
        System.out.println("Programa prasideda...");


        try {
            masyvas[3] = 5;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Netinkamas masyvo elementas");
            //custom logika
            masyvas[0] = 55;
        } finally {
            //atliekam kazkokius uzbaigiamuosius veiksmus
            System.out.println("VISADA VYKDOMAS GALE");
        }

        System.out.println(masyvas[0]);

    }
}
