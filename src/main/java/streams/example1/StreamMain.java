package streams.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //Streams represent sequence of elements
        //Common operations of stream map, filter, foreach, etc...

        List<String> colors = Arrays.asList("Red", "Green", "White", "Black", "Blue");

        colors.stream().sorted().findFirst().ifPresent(System.out::println);

        //streamas sukurtas naudojant Stream klase
        Stream.of("apple", "cherry", "banana", "potato", "burokel")
                .filter(fruit -> fruit.startsWith("b"))
                .forEach(fruit -> System.out.println("Starts with B fruit " + fruit));

        List<String> words = Stream.of("Java", "Table", "Chair", "Banana")
                .map(string -> string.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(words);

        //Primitive streams, forEach uses consumer

        IntStream.range(1, 10).forEach(skaicius -> System.out.println(skaicius));

        List<Integer> numbers = Stream.of(5, 6, 10, 7, 0).sorted().collect(Collectors.toList());
        System.out.println(numbers);


    }
}
