package exeptions.example2;

/*
Errors may occur by the fault of programmer, wrong input, other unpredictable things.

Normally if unexpected error will pop up - program will crash
with the hel of exeptions we can continue to execute the program

 */
public class ExeptionTester2 {

    public static void main(String[] args) {
        System.out.println("Programm started...");

        System.out.println("Starting calculations...");
        try{
            int x = 5 / 0;
        } catch (ArithmeticException exeption){
            System.out.println("Exeption is caught and handled. Moving on...");
        } catch (Exception e){
            System.out.println("Nezinau kodel taip ivyko");
        }


        System.out.println("Moving further...");
    }

}
