package exeptions.example1;

/*
Exeptions used  to handle runtime errors so the normal flow of the application can be maintained

Exeptions is thrown only when preconditions are broken. Something unexpected but known happen

We dont throw for example IncorrectInputExeption,
we throw ComputerIsOnFire exeption.

We do not ignore exeptions, we need to handle them and act accordingly
*/
public class BenefitsOfExeptions {
    public static void main(String[] args) {
        System.out.println(calculatePercentage(5,0));
        System.out.println(calculatePercentageWithExeption(5,0));
    }

    private static double calculatePercentage(int a, int b) {
        //100 * (a/b) - formule

        if (b == 0) {
            return -1;
        } else {
            return (a / b) * 100;
        }
    }

    private static double calculatePercentageWithExeption(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Second argument cannot be zero");
        } else{
            return (a / b) * 100;
        }
    }
}
