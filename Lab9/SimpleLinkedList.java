import java.util.*;

public class SimpleLinkedList<T> implements Iterable<T> {
    private static class Node<T>{T value;Node<T> next;Node(T v){value=v;}}
    private Node<T> head,tail;
    void add(T value){Node<T> n=new Node<>(value);if(tail==null)head=n;else tail.next=n;tail=n;}
    public Iterator<T> iterator(){return new ListIterator();}
    private class ListIterator implements Iterator<T>{
        private Node<T> current=head;
        public boolean hasNext(){return current!=null;}
        public T next(){if(!hasNext())throw new NoSuchElementException();T value=current.value;current=current.next;return value;}
    }
}
