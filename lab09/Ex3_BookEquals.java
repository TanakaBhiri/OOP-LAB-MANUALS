import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
    private final String isbn;
    private final String title;

    Book(String isbn, String title) { this.isbn = isbn; this.title = title; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book other)) return false;
        return isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() { return Objects.hash(isbn); }

    @Override
    public String toString() { return title + " [" + isbn + "]"; }
}

public class Ex3_BookEquals {
    public static void main(String[] args) {
        Set<Book> shelf = new HashSet<>();
        shelf.add(new Book("111", "Clean Code"));
        shelf.add(new Book("222", "Effective Java"));
        boolean added = shelf.add(new Book("111", "Clean Code (second copy)"));

        System.out.println("Second copy added? " + added);
        System.out.println("Shelf size: " + shelf.size());
    }
}
