package enums.example3;

public class ProgrammerMain {
    public static void main(String[] args) {
        System.out.println(Programmer.LEAD);
        System.out.println(Programmer.JUNIOR.getSalary());

        for (Programmer programmer : Programmer.values()) {
            System.out.println(programmer + "hasYears of experience" + programmer.getExperience());
            System.out.println("salary " + programmer.getSalary());
            System.out.println("==========");
        }
    }


}
