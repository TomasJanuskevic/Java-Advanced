package encapsulation.example1;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Lebron");
        person.setLastName("James");
        System.out.println(person);

        Person anotherPerson = new Person("Kobe", "Bryant", 25, 100, 200);
        System.out.println(anotherPerson);

        anotherPerson.setAge(27);
        System.out.println(anotherPerson);
    }


}
