package homewoks.homework2021_01_10.exercise_2;


import java.util.List;
import java.util.Scanner;

public class AdministrationService {

    public void addEmployee(List<Employee> employees) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerByte = new Scanner(System.in);
        System.out.print("Enter Id -> ");
        int id = scannerInt.nextInt();
        System.out.print("Enter name -> ");
        String name = scannerString.nextLine();
        System.out.print("Enter age -> ");
        byte age = scannerByte.nextByte();
        System.out.print("Enter personal code -> ");
        int personalCode = scannerInt.nextInt();
        System.out.print("Enter salary -> ");
        int salary = scannerInt.nextInt();
        System.out.print("Enter position -> ");
        String position = scannerString.nextLine();
        System.out.print("Enter experience -> ");
        int experience = scannerInt.nextInt();

        Employee employee = new Employee(id, name, age, personalCode, salary, position, experience);
        employees.add(employee);
    }

    public void removeEmployeeById(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == id) {
                employees.remove(employee);
                return;
            }
        }
        System.out.println("Where isnt employee with this ID");
    }

    public void showEmployee(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Where isnt employee with this ID");
    }

    public void showEmployee(List<Employee> employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Where isnt employee with this name");
    }

    public void updateEmployee(List<Employee> employees) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Choose employee by Id");
        int id = scannerInt.nextInt();
        showEmployee(employees, id);
        int index = 0;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId() == id) {
                index = i;
            }
        }

        System.out.println("Choose that you want update\n" +
                "a. Salary\n" +
                "b. Position\n" +
                "c. Experience");
        String choice = scannerString.nextLine();
        switch (choice) {
            case "a":
                System.out.print("Salary: ");
                int newSalary = scannerInt.nextInt();
                employees.get(index).setSalary(newSalary);
                break;
            case "b":
                System.out.print("Position: ");
                String newPosition = scannerString.nextLine();
                employees.get(index).setPosition(newPosition);
                break;
            case "c":
                System.out.print("Experience: ");
                int newExperience = scannerInt.nextInt();
                employees.get(index).setExpirience(newExperience);
                break;
        }

    }
}
