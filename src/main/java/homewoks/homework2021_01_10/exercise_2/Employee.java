package homewoks.homework2021_01_10.exercise_2;

public class Employee {
    private int employeeId;
    private String name;
    private byte age;
    private int personalCode;
    private int salary;
    private String position;
    private int expirience;

    public Employee(int employeeId, String name, byte age, int personalCode) {
        this.employeeId = employeeId;
        this.name = name;
        if (age < 18) {
            System.out.println("Employee must be over 18 years old");
        } else {
            this.age = age;
        }
        this.personalCode = personalCode;
    }

    public Employee(int employeeId, String name, byte age, int personalCode, int salary, String position, int expirience) {
        this(employeeId, name, age, personalCode);
        this.salary = salary;
        this.expirience = expirience;
        this.position = position;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary < 500) {
            System.out.println("Minimun salary was 500eur");
        } else {
            this.salary = salary;
        }

    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getExpirience() {
        return expirience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", expirience=" + expirience +
                '}';
    }
}
