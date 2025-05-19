package myTest.incrementAnDecrement;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(b);
        System.out.println(a + b);

        System.out.println("-".repeat(30));
        String s = "Nghia";
        String s1 = " Le";
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());

        System.out.println(s.equals(s1));

        System.out.println("-".repeat(30));
        System.out.println(s.concat(s1));

        String fullName = s.concat(s1);
        System.out.println(fullName.substring(0, 3));

        System.out.println("-".repeat(30));
        String newDate = "25/11/1982";
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));

        System.out.println("-".repeat(30));
        // Anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running r1...");
            }
        };
        r.run();

        // Lambda
        Runnable r2 = () -> System.out.println("Running r2...");
        r2.run();

        System.out.println("-".repeat(30));
        Consumer<String> printer = w -> System.out.println("Hello" + w);
        printer.accept("Nghia");

        Supplier<String> nameSupplier = () -> "John Doe";
        System.out.println(nameSupplier.get()); // John Doe

        StringToInt<String> converter = x -> Integer.parseInt(x);
        System.out.println(converter.convert("123"));
        System.out.println();


    }
}

@FunctionalInterface
interface StringToInt<T>{
    int convert(T t);
}
