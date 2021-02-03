package homewoks.homework2021_01_17.homework_1;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Reks");
        Animal cat = new Cat("Murkis");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println(((Dog) animal).name);
            } else if(animal instanceof Cat) {
                System.out.println(((Cat) animal).name);
            } else {
                System.out.println("Something going wrong");
            }
            animal.yieldVoice();
            System.out.println("------------");
        }
    }
}
