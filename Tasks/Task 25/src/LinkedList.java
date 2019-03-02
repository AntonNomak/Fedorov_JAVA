import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> implements List<T> {
    private Node top;
    private Node tail;
    private int count;
    private Node current;

    private static class Node<T> {
        T element;
        Node <T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }

    }


    public LinkedList() {
        this.top = null;
        this.count = 0;
    }

    @Override
    public void add(T element) {
        Node node = new Node(element);
        if (top == null) {
            tail = node;
        }

        node.next = top;
        count++;
        top = node;
    }


    @Override
    public void addToBegin(T element) {
        Node node = new Node(element);

        if (top == null) {
            tail = node;
        }

        node.next = top;
        count++;
        top = node;

    }

    @Override
    public void addToEnd(T element) {
        Node node = new Node(element);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;

    }

    @Override
    public void remove(int index) {
        current = top;
        if (index == 0) {
            top = top.next;
            count = count - 1;
            return;
        }
        for (int i = 0; i <= count; i++) {
            if (i + 1 == index) {
                if (current.next.next == null) {
                    tail = current;
                }
                current.next = current.next.next;
                count = count - 1;
                break;
            }
            current = current.next;
        }
    }

    @Override
    public T get(int index) {
         if (index < count && index >= 0) {
            current = top;
            for (int i = 0; i < count; i++) {
                if (i == index) {
                    return (T) current.element;
                }
                current = current.next;
            }
        }
        throw new IndexOutOfBoundsException();

    }


    @Override
    public void insert(T element, int index) {
        if (index < 0 || index > count) {
            System.err.println("Неккоректный индекс");
            return;
        }
        Node node = new Node(element);
        current = top;
        Node prevous;
        if (index == 0) {
            addToBegin(element);
            return;
        }
        if (index == count) {
            addToEnd(element);
            return;
        }
        for (int i = 0; i < count; i++) {
            if (i + 1 == index) {
                prevous = current;
                current = current.next;
                prevous.next = node;
                node.next = current;
                count++;
                return;
            } else {
                current = current.next;
            }
        }

    }

    @Override
    public void reverse() {
        Node previous = null;
        Node current = top;
        Node forward;

        while (current != null) {
            forward = current.next;

            current.next = previous;

            previous = current;

            current = forward;

        }
        forward = top;
        top = tail;
        tail = forward;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public boolean contains(T element) {
        LinkedListIterator iterator = new LinkedListIterator();
        for (int i = 0; i < count; i++) {
            if (iterator.next() == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        LinkedListIterator iterator = new LinkedListIterator();
        for (int i = 0; i < count; i++) {
            if (iterator.next() == element) {
                return i;
            }
        }
        return -1;
    }
        /*current = top;
        for (int i = 0; i < count; i++) {
            if (current.element == element) {
                return i;
            }
                current = current.next;
        }
        return -1;*/



    @Override
    public void print() {
        LinkedListIterator iterator = new LinkedListIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    private class LinkedListIterator implements Iterator<T>{
        Node current;//поле
        public LinkedListIterator(){
            this.current = top;//переменная начинается с головы связного списка.
        }

        @Override
        public boolean hasNext() {//метод для проверки наличия следующего элемента
            return current != null;
        }

        @Override
        public T next() {//метод для получения следующего элемента
            T element = (T) current.element;
            current = current.next;
            return element;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
