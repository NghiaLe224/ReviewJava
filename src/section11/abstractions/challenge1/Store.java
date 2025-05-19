package section11.abstractions.challenge1;

import java.util.ArrayList;

record OrderItem(int qty, ProductsForSale product){}

public class Store {
    private static ArrayList<ProductsForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Funiture("Deskl", 500, "Mahogany Desk"));
        storeProducts.add(new Funiture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addToOrder(order1, 1, 2);
        addToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addToOrder(order2, 3, 5);
        addToOrder(order2, 0, 1);
        addToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts(){
        for(var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double saleTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            saleTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", saleTotal);
    }
}
