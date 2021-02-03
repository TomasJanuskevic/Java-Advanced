package collections.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        /*
        List - orderer collecion of elements
        Elements can be accessed by their index
         */

        List<String> animals = new ArrayList<>();
        animals.add("Begemotas");
        animals.add("Zirafa");
        animals.add("Sernas");
        animals.add("Antilope");

        System.out.println(animals);
        System.out.println("Po rusiavimo...");
        Collections.sort(animals);
        System.out.println(animals);
        Collections.sort(animals, Collections.reverseOrder());
        System.out.println("Po rusiavimo is kitos puses...");
        System.out.println(animals);

        //Collections useful library for manipulating lists
        List<Integer> skaiciai = Arrays.asList(8, 4, 5, 6, 1);
        System.out.println("Max value of list " + Collections.max(skaiciai));
        System.out.println("Min value of list " + Collections.min(skaiciai));


    }
}
