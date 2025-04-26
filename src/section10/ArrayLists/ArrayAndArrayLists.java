package section10.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayLists {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        System.out.println("-".repeat(30));
        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));

        System.out.println("-".repeat(30));
//        originalList.remove(0);
//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println("newList = " + newList);

    }
}
