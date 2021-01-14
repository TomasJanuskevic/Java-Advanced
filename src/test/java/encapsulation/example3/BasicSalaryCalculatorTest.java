package encapsulation.example3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class BasicSalaryCalculatorTest {

    private BasicSalaryCalculator basicSalaryCalculator;

    @BeforeEach
    void setUpBeforeEach() {
        basicSalaryCalculator = new BasicSalaryCalculator();
    }

    @Test
    void testSocialInsuranceCalculator() {
        double basicSalary = 4000;
        basicSalaryCalculator.setBasicSalary(basicSalary);

        double exectedSocialInsurance = basicSalary * 0.25;
        assertEquals(exectedSocialInsurance, basicSalaryCalculator.getSocialInsurance());
    }

    @Test
    void testAdditionalBonusCalculation() {
        double basicSalary = 2000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectedAdditionalBonus = basicSalary * 0.1;

        double actualAdditionalBonus = basicSalaryCalculator.getAdditionalBonus();

        assertEquals(expectedAdditionalBonus, actualAdditionalBonus);
    }

    @Test
    void testGrossSalaryCalculation() {
        double basicSalary = 6000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectedGrossSalary = 8100;

        double actualGrossSalary = basicSalaryCalculator.getGrossSalary();

        assertEquals(expectedGrossSalary, actualGrossSalary);
    }

    @Test
    @DisplayName("Should thrown an exeption then salary is below 0")
    void testBasicInvalidSalary() {
        final double basicSalary = -1000;
        assertThrows(IllegalArgumentException.class, () -> basicSalaryCalculator.setBasicSalary(basicSalary));
    }

}