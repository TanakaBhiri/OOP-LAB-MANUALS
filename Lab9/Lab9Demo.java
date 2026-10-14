import java.util.*;
public class Lab9Demo {
    public static void main(String[] args) {
        for(Level level:Level.values())switch(level){
            case LOW->System.out.println("LOW: proceed carefully");
            case MEDIUM->System.out.println("MEDIUM: pay attention");
            case HIGH->System.out.println("HIGH: take immediate action");
        }
        Student s1=new Student("Rudo",20),s2=new Student("Rudo",20);
        System.out.println(s1);System.out.println("equal records? "+s1.equals(s2));System.out.println("name="+s1.name());
        Set<Book> books=new HashSet<>();books.add(new Book("Java Basics","ISBN-1"));books.add(new Book("Another title, same ISBN","ISBN-1"));
        System.out.println("Book set size="+books.size()+" "+books);
        SimpleLinkedList<String> list=new SimpleLinkedList<>();list.add("A");list.add("B");list.add("C");for(String x:list)System.out.print(x+" ");System.out.println();
        System.out.println("Coins for 87 cents: "+Coin.fewestCoins(87));
    }
}