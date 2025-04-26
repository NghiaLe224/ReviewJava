package section10.ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available action:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove item(s) from list (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

    private static void addItem(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separated by space]");
        String[] items = sc.nextLine().split(",");

        for (String item : items) {
            String trimmedItem = item.trim();
            if (!groceries.contains(trimmedItem)) {
                groceries.add(trimmedItem);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separated by space]");
        String[] items = sc.nextLine().split(",");

        for (String item : items) {
            String trimmedItem = item.trim();
            groceries.remove(trimmedItem);
        }
    }

}
