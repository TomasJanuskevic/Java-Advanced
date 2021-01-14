package encapsulation.example4;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String breed;
    private int weight;

    public Dog(String name, int age, String gender, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.weight = weight;
    }

    public Dog(String gender, String breed) {
        this("Fido", 1, gender, breed, 5);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
