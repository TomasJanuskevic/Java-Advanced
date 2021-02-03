package collections.example1;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        /*
        No duplicates allowed
        Return elemrnts in non predictable order
         */

        Set<String> computerNames = new HashSet<>();
        computerNames.add("HP");
        computerNames.add("Lenovo");
        computerNames.add("Asus");
        computerNames.add("Mac");
        computerNames.add("Mac");

        if(computerNames.contains("Asus")){
            System.out.println("Sarase yra ASUS PC");
        }

        System.out.println(computerNames);

    }
}
