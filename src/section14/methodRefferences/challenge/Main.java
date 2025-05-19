package section14.methodRefferences.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Nghia Le", "Tuan Nguyen", "Thao Le", "Trieu Do", "Soc Le", "Tho Le"};

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + ".",
                s -> s += " " + reverse(s, 0, s.indexOf(" ")),
                Main::reverse
        ));

        applyChange(names, list);
    }

    private static void applyChange(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function : stringFunctions){
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char  getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar);
    }

    private static String reverse(String s){
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end){
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}
