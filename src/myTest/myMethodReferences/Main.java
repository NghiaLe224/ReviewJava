package myTest.myMethodReferences;

import java.util.*;
import java.util.function.UnaryOperator;

class Person{
    public void greet(){
        System.out.println("Hello...");
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nam", "An", "Tú", "Bình");

        // Anonymous class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names);

        // Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // Method References
        Collections.sort(names, String::compareTo);


        names.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        System.out.println("with anonymous class: " + names);
        names.replaceAll(s -> s.toLowerCase());
        System.out.println("with lambda expression: " + names);
        names.replaceAll(String::toUpperCase);
        System.out.println("with method references: " + names);


        String[] myStringArray = new String[10];
        Arrays.setAll(myStringArray, i -> {
            System.out.println(i);
            System.out.println(Arrays.toString(myStringArray));
            return Integer.toString(i + 1);
        });

        // bounded receiver
        Person person = new Person();
        Runnable run = person::greet;
        run.run();

        Random random = new Random();
//        System.out.println(random.nextInt());
        System.out.println((int)'A');
        System.out.println((int)'Z');
    }
}
