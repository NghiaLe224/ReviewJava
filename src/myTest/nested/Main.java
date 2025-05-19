package myTest.nested;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(new Book("Harry Porter", 1991),
                                            new Book("Game Of Thrones", 1998),
                                            new Book("Lord Of The Ring", 2000)));

        books.sort(new Book.BookComparator<Book>("publicYear"));
        for(Book book : books) {
            System.out.println(book);
        }

    }
}
