package homewoks.homework2021_01_10.exercise_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class AdministrationServiceTest {


    @Test
    void removeEmployeeById() throws Exception {
        List<Employee> actualEmployees = new ArrayList<>();
        List<Employee> expectedEmployees = new ArrayList<>();
        Employee employee1 = new Employee(1, "Bob",
                (byte) 20, 123, 1500, "IT", 5);

        Employee employee2 = new Employee(2, "Jack",
                (byte) 25, 456, 2000, "IT", 10);

        expectedEmployees.add(employee2);
        actualEmployees.add(employee1);
        actualEmployees.add(employee2);

        AdministrationService administrationService = new AdministrationService();

       administrationService.removeEmployeeById(actualEmployees, 1);

        assertThat(expectedEmployees).isEqualTo(actualEmployees);
    }
}