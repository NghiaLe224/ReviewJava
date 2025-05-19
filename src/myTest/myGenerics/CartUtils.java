package myTest.myGenerics;

import java.util.ArrayList;
import java.util.List;

public class CartUtils {
    public static <T extends Product> boolean areCartsEqual(Cart<T> c1, Cart<T> c2) {
        List<T> l1 = c1.getItems();
        List<T> l2 = c2.getItems();

        if (l1.size() != l2.size()) return false;

        List<T> tempList = new ArrayList<>(l2);
        for (T item : l1) {
            if (!tempList.remove(item)) {
                return false;
            }
        }
        return tempList.isEmpty();
    }

    public static double calculateTotal(List<? extends Product> products) {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public static void addDefaultBooks(List<? super Book> list) {
        list.add(new Book("Default Book A", 10));
        list.add(new Book("Default Book B", 12));
    }
}
