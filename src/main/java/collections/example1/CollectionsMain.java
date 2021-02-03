package collections.example1;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        List<String> eiluciuSarasas = new ArrayList<>();
        eiluciuSarasas.add("Labas");

        Set<String> rinkinys = new HashSet<>();
        rinkinys.add("Labas");

        Map<String, Integer> mapas = new HashMap<>();
        mapas.put("Jonaitis", 868112);

// List

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(1);
        listOfIntegers.add(6);
        listOfIntegers.add(5);

        for (Integer singleInteger : listOfIntegers) {
            System.out.println(singleInteger);
        }
        listOfIntegers.stream().forEach((s) -> System.out.println(s));// java 8 feature lambdas and streams
        System.out.println(listOfIntegers);

        //Set

        Set<String> names = new HashSet<>();
        names.add("Dario");
        names.add("Mario");
        names.add("Luigi");
        System.out.println(names);

        Map<Integer, Integer> skaiciuMapas = new HashMap<>();
        skaiciuMapas.put(5, 2);
        skaiciuMapas.put(4, 2);
        skaiciuMapas.put(7, 6);

        Map<Integer, List<String>> telefonuKnyga = new HashMap<>();
        List<String> vardai = Arrays.asList("Tomas", "Darius", "Arturas", "Povilas");
        List<String> kitiVardai = Arrays.asList("Samanta", "Sandra", "Gabriele", "Olivia");

        telefonuKnyga.put(1, vardai);
        telefonuKnyga.put(2, kitiVardai);

        System.out.println(telefonuKnyga);

        System.out.println(telefonuKnyga.get(2));
        System.out.println(telefonuKnyga.get(2).get(1));

        telefonuKnyga.put(3, Arrays.asList("Bill", "Tom"));
        for (List<String> varduSarasas : telefonuKnyga.values()) {
            for (String vardasIsSaraso : varduSarasas) {
                System.out.println("Vardas sarase: - " + vardasIsSaraso);
            }

        }
    }
}
