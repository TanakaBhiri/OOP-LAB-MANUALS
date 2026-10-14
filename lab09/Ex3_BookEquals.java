import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Lab 9, Exercise 3 (Intermediate): equals/hashCode on ISBN; prove a HashSet<Book> rejects duplicates. */
class Book {
    private final String isbn;
    private final String title;

    Book(String isbn, String title) { this.isbn = isbn; this.title = title; }

    // Two books are equal when their ISBN matches, regardless of title
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book other)) return false;      // null or wrong type
        return isbn.equals(other.isbn);
    }

    // CONTRACT: equal objects MUST have equal hash codes, so hash the same field(s) equals uses
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
        boolean added = shelf.add(new Book("111", "Clean Code (second copy)"));   // same ISBN

        System.out.println("Second copy added? " + added);          // false: rejected as a duplicate
        System.out.println("Shelf size: " + shelf.size());          // 2
    }
}
