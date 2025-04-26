package section10.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getName());
//        list.add("yogurt");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        System.out.println("Fourth item = " + groceries.get(3));

        System.out.println("-".repeat(30));
        if (groceries.contains("pickles")) {
            System.out.println("List contains pickles");
        }

        System.out.println("-".repeat(30));
        groceries.add("yogurt");
        System.out.println("First = " + groceries.indexOf("yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("yogurt"));

        System.out.println("-".repeat(30));
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        groceries.clear();
        System.out.println(groceries);
        System.out.println("Groceries isEmpty = " + groceries.isEmpty());

        System.out.println("-".repeat(30));
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        System.out.println("-".repeat(30));
        System.out.println(groceries.getClass().getTypeName());
        var groceriesArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(groceriesArray.getClass().getTypeName());
        System.out.println(Arrays.toString(groceriesArray));


    }
}
