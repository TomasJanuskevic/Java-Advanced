package interfaces.example2;

public class TaxCalculator2020 implements TaxCalculator{

    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;// gera praktika iskelti i static constanta arba i duombaze
    }
}
