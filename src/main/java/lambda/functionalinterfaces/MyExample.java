package lambda.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyExample {
    public static void main(String[] args) {
        Predicate<String> a = s -> s.startsWith("a");

        boolean b = a.test("ara");
        System.out.println(b);

        Supplier<Integer> integerSupplier = () -> 5;
        int number = integerSupplier.get();
        System.out.println(number);

        Function<Integer, Integer> integerFunction = num -> {
            return num + 2;
        };
        int num = integerFunction.apply(5);
        System.out.println(num);
    }
}
