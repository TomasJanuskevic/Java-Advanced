package interfaces.example2;

//Rule - class should not worry about the calculator object instance.
// this class should only use it.

// we can inject implementation or dependencies via:
//COnstructor
//Setters
//Methods
public class TaxReport {

    private TaxCalculator taxCalculator;

    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public  void showCalculatedTax(){
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}
