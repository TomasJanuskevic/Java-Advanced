package abstraction.example2;

// abstract can not be initiated (no bbjrct creation with NEW keyword)
//extends keyword needs to be used to use the class
//fields, non-abstract, static methods work in regular way (as in regular class)

// purpose of abstraction - hide implementation details from the client (class that extends it)

//Abstract class defines what OBJECT IS. Partially abstract. Might include concrete implementation.EXTENDS
// Interface defines what OBJECT DOES (what can do) Interface is purely abstract. IMPLEMENTS


public class AbstractDemo {

    public static void main(String[] args) {
        Bank swedbank = new Swedbank();
        swedbank.deposit();
        swedbank.withdraw();
        swedbank.calculateSpecificBankTax();

        Bank seb = new SEB();
        seb.deposit();
        seb.withdraw();
        seb.calculateSpecificBankTax();
    }
}

abstract class Bank{
    public int commonBankTax = 5;

    public void deposit(){
        System.out.println("Common deposit method for all banks");
    }

    public void withdraw(){
        System.out.println("Common withdraw method for all banks");
    }

    public abstract void calculateSpecificBankTax();
}


class Swedbank extends Bank {
    @Override
    public void calculateSpecificBankTax() {
        System.out.println("Swedbank tax amount - " + 15);
        System.out.println("Common bank tax applies - " + commonBankTax);
    }
}

class SEB extends Bank{
    @Override
    public void calculateSpecificBankTax() {
        System.out.println("SEB tax amount - " + 17);
        System.out.println("Common bank tax applies - " + commonBankTax);
    }
}