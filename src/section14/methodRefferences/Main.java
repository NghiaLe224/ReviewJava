package section14.methodRefferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld{

    private static int last_id = 1;
    private int id;
    public PlainOld(){
        id = last_id++;
        System.out.println("Creating a PlainOld Object: id = " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Nghia", "Thao", "Tuan", "Trieu"
        ));

        names.forEach((System.out::println));

        calculator(Integer::sum,10 ,25);
        calculator(Double::sum, 2.5, 7.5);

        Supplier<PlainOld> reference1 = PlainOld::new;

        PlainOld newPojo = reference1.get();

        System.out.println("Getting array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

        calculator((s1, s2) -> s1 + s2, "Hello ", "World");
        calculator((s1, s2) -> s1.concat(s2), "Hello ", "World");
        calculator(String::concat, "World ", "Hello");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello", "World"));
        System.out.println(b2.apply("Hello", "World"));
        System.out.println(u1.apply("Hello"));

    }

    private static <T> void calculator(BinaryOperator<T> func, T val1, T val2) {
        T result = func.apply(val1, val2);
        System.out.println("Result: " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}
