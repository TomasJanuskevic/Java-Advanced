package interfaces.example2;

public class TaxMAin {
    public static void main(String[] args) {
        //concrete Implementation
        //Tightly coupled to specific implementation
        TaxCalculator2020 taxCalculator2020 = new TaxCalculator2020(1000);
        taxCalculator2020.calculateTax();

        //instead we program to an abstraction
        TaxCalculator taxCalculator = new TaxCalculator2021();
        taxCalculator = new TaxCalculator2020(100);

        TaxReport taxReport = new TaxReport(new TaxCalculator2020(500));
        TaxReport anotherTaxReport = new TaxReport(new TaxCalculator2021());

    }
}
