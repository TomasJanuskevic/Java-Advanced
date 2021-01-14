package homewoks.homework2021_01_10.exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        OUTER:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("a. Show existing employees\n" +
                    "b. Add new Employee\n" +
                    "c. Update employee\n" +
                    "d. Remove employee\n" +
                    "e. Show employee\n" +
                    "f. Exit");
            String choice = scanner.nextLine();
            AdministrationService administrationService = new AdministrationService();
            switch (choice) {
                case "a":
                    System.out.println(employees);
                    break;
                case "b":
                    administrationService.addEmployee(employees);
                    break;
                case "c":
                    administrationService.updateEmployee(employees);
                    break;
                case "d":
                    System.out.print("Enter employee ID: ");
                    administrationService.removeEmployeeById(employees, scanner.nextInt());
                    break;
                case "e":
                    System.out.println("Enter name or ID");
                    String nameOrId = scanner.nextLine();
                    if (nameOrId.matches("[0-9]+")) {
                        administrationService.showEmployee(employees, Integer.parseInt(nameOrId));
                    } else {
                        administrationService.showEmployee(employees, nameOrId);
                    }
                    break;
                case "f":
                    break OUTER;
            }
        }
    }
}
