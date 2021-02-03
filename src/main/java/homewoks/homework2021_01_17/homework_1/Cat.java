package homewoks.homework2021_01_17.homework_1;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void yieldVoice() {
        System.out.println("Miau, miau");
    }
}
