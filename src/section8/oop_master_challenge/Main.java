package oop_master_challenge;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();

//        Hamburger hamburger = new Hamburger("regular", 4.00);
//        hamburger.addTopping("BACON", "CHEESE", "MAYO");
//        hamburger.printItem();

//        Order regularMeal = new Order();
//        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//        System.out.println("-".repeat(100));
//        Order secondMeal = new Order("turkey", "7-up", "chili");
//        secondMeal.addBurgerTopping("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();
//        System.out.println("-".repeat(100));

        Order deluxeMeal = new Order("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerTopping("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
