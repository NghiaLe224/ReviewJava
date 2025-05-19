package myTest.myGenerics;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Product> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<T> getItems() {
        return items;
    }

    public T getMostExpensiveItem() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.getPrice() > max.getPrice()) {
                max = item;
            }
        }
        return max;
    }
}
