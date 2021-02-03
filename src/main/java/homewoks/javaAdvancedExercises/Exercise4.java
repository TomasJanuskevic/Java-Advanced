package homewoks.javaAdvancedExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    static public List<String> toUpperCase(List <String> list){
        return list.stream().map(word->word.toUpperCase()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("book", "chair");
        System.out.println(toUpperCase(words));
    }
}
