package homewoks.schoolManagementSystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher bob = new Teacher(3, "Bob", 600);

        Student ana = new Student(1, "Ana", 5);
        Student kate = new Student(2, "Kate", 8);
        Student john = new Student(3, "John", 6);

        List<Teacher> teacherList = Arrays.asList(lizzy, mellisa, bob);
        List<Student> studentList = Arrays.asList(ana, kate, john);


        School school = new School(teacherList, studentList);


        kate.payFees(5000);
        john.payFees(1000);

        System.out.println("School has earned " + school.getTotalMoneyEarned());


        System.out.println("------Making school pay salary------");
        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println("School has spent for salary to " + lizzy.getName() + " and now has "
                + school.getTotalMoneyEarned());

    }
}
