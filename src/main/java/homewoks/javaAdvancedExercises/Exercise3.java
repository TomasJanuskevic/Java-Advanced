package homewoks.javaAdvancedExercises;

import java.util.Arrays;
import java.util.List;


public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        double a = numbers.stream().mapToInt(num->num).average().getAsDouble();
        System.out.println(a);

    }

}
