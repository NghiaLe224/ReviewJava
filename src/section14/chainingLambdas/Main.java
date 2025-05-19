package section14.chainingLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
         String name = "Nghia";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Le"); // doi tuong co function apply nhan vao 1 doi so va tra ve doi so noi voi "Le"
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Le"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Le"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name));

        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Le"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println(f2.apply(name));

        String[] names = {"Nghia", "Trieu"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0.andThen(s -> System.out.print(" - ")).andThen(s1));

        Predicate<String> p1 = s -> s.equals("NGHIA");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Nghia");
        Predicate<String> p3 = s -> s.endsWith("s");
        Predicate<String> p4 = s -> s.startsWith("N");

        Predicate<String> combined1 = p1.or(p2);
        System.out.println("Combined1 = " + combined1.test(name));

        Predicate<String> combine2 = p3.and(p4);
        System.out.println("Combine2 = " + combine2.test(name));

        Predicate<String> combine3 = p3.and(p4).negate();
        System.out.println("Combine3 = " + combine3.test(name));

        record Person(String firstName, String lastName){}

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("Peter", "PumpkinEater"),
                new Person("Minnie", "Mouse"),
                new Person("Mickey", "Mouse")
        ));

        list.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        //list.sort(Comparator.comparing(o -> o.lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(50));
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(50));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName)
        );
        list.forEach(System.out::println);

        System.out.println("-".repeat(50));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName).reversed()
        );
        list.forEach(System.out::println);
    }
}
