import java.util.*;

public class Book {
    private final String title,isbn;
    Book(String title,String isbn){this.title=title;this.isbn=isbn;}
    public boolean equals(Object o){return o instanceof Book b && isbn.equals(b.isbn);}
    public int hashCode(){return Objects.hash(isbn);}
    public String toString(){return title+" ["+isbn+"]";}
}
