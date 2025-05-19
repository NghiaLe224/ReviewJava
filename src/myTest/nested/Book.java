package myTest.nested;

import java.util.Comparator;

public class Book {

    static class BookComparator<T extends Book> implements Comparator<Book> {

        private String sortType;

        public BookComparator() {
            this("title");
        }

        public BookComparator(String sortType){
            this.sortType = sortType;
        }

        public int compare(Book b1, Book b2) {
            return switch (sortType){
                case "publicYear" -> b1.publicYear - b2.publicYear;
                default -> b1.title.compareTo(b2.title);
            };
        }
    }

    private String title;
    private int publicYear;

    public Book(String title, int publicYear) {
        this.title = title;
        this.publicYear = publicYear;
    }

    @Override
    public String toString() {
        return "%s - %d".formatted(title, publicYear);
    }
}
