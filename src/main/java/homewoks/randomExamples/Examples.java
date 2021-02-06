package homewoks.randomExamples;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        //Methods can be turned into lambdas
        //Data type does not need to be specified
        IntFunction<String> intToString = number -> Integer.toString(number);
        System.out.println(intToString.apply(123).length());

        //lambdas made using constructor
        //I will provde STRING , but expect BigInteger as result
        Function<String, BigInteger> convertedBigInt = BigInteger::new;
        BigInteger bigIntegerFromString = convertedBigInt.apply("21");
        System.out.println("Converted value now is " + bigIntegerFromString);
        System.out.println(bigIntegerFromString instanceof BigInteger);


        List<String> list = Arrays.asList("a", "b", "hello");
        List<String> list2 = list.stream().filter(a -> a.length() > 2).collect(Collectors.toList());
        System.out.println(list2);
    }
}
