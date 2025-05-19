package myTest.myGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cart<Book> bookCart = new Cart<>();
        bookCart.addItem(new Book("Java Basics", 30));
        bookCart.addItem(new Book("Effective Java", 45));
        bookCart.addItem(new Book("Clean Code", 40));

        Cart<Electronic> elecCart = new Cart<>();
        elecCart.addItem(new Electronic("Laptop", 750));
        elecCart.addItem(new Electronic("Mouse", 25));

        System.out.println("Tổng giá bookCart: " + bookCart.getTotalPrice());
        System.out.println("Sách đắt nhất: " + bookCart.getMostExpensiveItem());

        // So sánh 2 cart
        Cart<Book> bookCart2 = new Cart<>();
        bookCart2.addItem(new Book("Clean Code", 40));
        bookCart2.addItem(new Book("Java Basics", 30));
        bookCart2.addItem(new Book("Effective Java", 45));

        System.out.println("2 giỏ sách giống nhau? " + CartUtils.areCartsEqual(bookCart, bookCart2));

        // Wildcard demo
        List<Product> mixed = new ArrayList<>();
        mixed.add(new Book("Spring Boot", 35));
        mixed.add(new Electronic("Monitor", 200));

        System.out.println("Tổng giá sản phẩm hỗn hợp: " + CartUtils.calculateTotal(mixed));

        CartUtils.addDefaultBooks(mixed);
        System.out.println("Sau khi thêm sách mặc định: " + mixed);

        // Type erasure
        GenericBox<String> box1 = new GenericBox<>();
        GenericBox<Integer> box2 = new GenericBox<>();
        System.out.println("box1 class = " + box1.getClass());
        System.out.println("box2 class = " + box2.getClass());
        System.out.println("Cùng class sau khi biên dịch? " + (box1.getClass() == box2.getClass()));
    }
}
