package lambda.functionalinterfaces;

import java.util.function.Function;

public class FunctionService implements FunctionalInterface {

    @Override
    public void execute() {
        //Accept one argument, produces one result
        //First argument input of type T
        //Second argument output of type R result

        Function<String, Integer> lengthFunction = (givenString) -> givenString.length();
        System.out.println("[FUNCTION 1] length of labadiena " + lengthFunction.apply("labadiena"));

        Function<Integer, Integer> multiplierFunction = givenNumber -> givenNumber * 2;
        Integer daugybosRezultatas = multiplierFunction.apply(8);
        System.out.println("[FUNCTION 2] skaicius padaugintas is 2" + multiplierFunction.apply(8));
    }
}
