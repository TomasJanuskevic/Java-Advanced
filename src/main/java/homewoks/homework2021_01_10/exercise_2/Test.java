package homewoks.homework2021_01_10.exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        addEmployee();




    }
    static public void addEmployee() {
        List<Employee> employees = new ArrayList<>();
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
        System.out.println(employees);
    }
}
