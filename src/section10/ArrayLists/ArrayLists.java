package section10.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class ArrayLists {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-".repeat(30));
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);

        System.out.println("-".repeat(30));
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 5));
        groceryList.add(0,
                new GroceryItem("Apples", "PRODUCE", 1));
        System.out.println(groceryList);
        System.out.println("-".repeat(20));
        groceryList.set(0,
                new GroceryItem("s", "PRODUCE", 1));
        System.out.println(groceryList);
        System.out.println("-".repeat(20));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
