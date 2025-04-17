package section8.oop_master_challenge;

public class Order {
    Hamburger hamburger;
    Item drink;
    Item side;

    public Order() {
        this("regular", "coke", "fries");
    }

    public Order(String hamburger, String drink, String side) {
        if (hamburger.equalsIgnoreCase("deluxe")) {
            this.hamburger = new DeluxeBurger(hamburger, 8.5);
        } else {
            this.hamburger = new Hamburger(hamburger, 4.0);
        }
        this.drink = new Item("drink", drink, 1.00);
        this.side = new Item("side", side, 1.50);
    }

    public double getTotalPrice() {
        if (hamburger instanceof DeluxeBurger) {
            return hamburger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + hamburger.getAdjustedPrice();
    }

    public void printItemizedList() {
        hamburger.printItem();
        if (hamburger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3) {
        hamburger.addTopping(extra1, extra2, extra3);
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (hamburger instanceof DeluxeBurger db) {
            db.addTopping(extra1, extra2, extra3, extra4, extra5);
        } else {
            hamburger.addTopping(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
