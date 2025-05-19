package section14.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWord = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] words = s.split(" ");
                for (String word : words) {
                    System.out.println(word);
                }
            }
        };

        //Change to Lambda
        Consumer<String> printWordsLambda = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWord.accept("Let's spit this up into an array");
        System.out.println("-".repeat(10));
        printWordsLambda.accept("Let's spit this up into an array");

        Consumer<String> printWordsForEach = s -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(x -> System.out.println(x));
        };
        System.out.println("-".repeat(10));
        printWordsForEach.accept("Let's spit this up into an array");

        Consumer<String> printWordsConcise = s -> {
            Arrays.asList(s.split(" ")).forEach(x -> System.out.println(x));
        };
        System.out.println("-".repeat(10));
        printWordsConcise.accept("Let's spit this up into an array");

        //change to lambda
        UnaryOperator<String> everySecondCharLambda = r -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < r.length(); ++i) {
                if (i % 2 == 1) {
                    result.append(r.charAt(i));
                }
            }
            return result.toString();
        };
        System.out.println("-".repeat(10));
        System.out.println(everySecondCharLambda.apply("1234567890"));

        System.out.println("-".repeat(10));
        System.out.println(everySecondCharacter(everySecondCharLambda, "1234567890"));

        System.out.println("-".repeat(10));
        Supplier<String> iLoveJava = () -> "i love Java";
        System.out.println(iLoveJava.get());
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); ++i) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }

}
