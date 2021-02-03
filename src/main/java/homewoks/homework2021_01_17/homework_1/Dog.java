package homewoks.homework2021_01_17.homework_1;

public class Dog extends Animal {
    String name;
    int legs = 5;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void yieldVoice() {
        System.out.println("Woof, woof");
    }
}
