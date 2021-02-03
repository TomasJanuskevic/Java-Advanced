package lambda.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
It is called functional interface because it acts as a function.
CAN HAVE ONLY one abstract method BUT lots of default implementation
 */
public class PredicateService implements FunctionalInterface {

    @Override
    public void execute() {

        //predicate needs an input type
        //tikriname ar eilute yra ilgesne negu 10
        Predicate<String> longerThanTen = (givenString) -> givenString.length() >10;
        boolean isStringLongerThan10Symbols = longerThanTen.test("TestEilute");
        System.out.println("[PREDICATE] test string is longer than 10 symbols - " + isStringLongerThan10Symbols);

        List<String> names = Arrays.asList("Angela", "Aaron", "Bill", "Clair", "David");

        Predicate<String> namesWithAPredicate = name -> name.startsWith("A");

        List<String> namesWithA = names.stream()
                                       .filter(name->name.startsWith("A"))
                                       .collect(Collectors.toList());

        System.out.println("[PREDICATE 2] name starts with A letter" + namesWithA);

    }
}
