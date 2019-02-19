package ru.itpark;

public class IntegerLinkedList {
    private Node top;
    private Node tail;
    private int count;
    private Node current;


    public IntegerLinkedList() {
        this.top = null;
        this.count = 0;
    }

    public void addToBegin(int value) {
        Node node = new Node(value);

        if (top == null) {
            tail = node;
        }

        node.setNext(top);
        count++;
        top = node;
    }

    public void addToEnd(int value) {
        Node node = new Node(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    public void print() {
        current = top;
        for (int i = count; i !=0; i--) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public void search(int value) {
        current = top;
        for (int i = 0; i <= count; i++) {
            if (current.getValue() == value) {
                System.out.println("Элемент найден под индексом" + " " + i);
                return;
            } else {
                current = current.getNext();
            }
        }
        System.out.println("Элемента в списке нет");
    }

    public void remove(int value){
        current = top;
        if(top.getValue()== value){
            top = top.getNext();
            count = count -1;
            return;
        }
        for (int i = 0; i <=count ; i++) {
            if(current.getNext().getValue() == value) {
                if(current.getNext().getNext() == null){
                    tail = current;
                }
                current.setNext(current.getNext().getNext());
                count = count - 1;
                break;
            }
            else {
                current = current.getNext();
            }
        }
    }

    public int get(int index){
        if (index<0 || index>count){
             System.err.println("Неподходящий индекс");
            return -1;
        }
        current = top;
        for (int i = 0; i < count ; i++) {
                if (i == index){
                    return current.getValue();
                }
            current = current.getNext();
        }
        return -1;
    }
    public void insert(int value,int index){
        if (index < 0 || index>count){
            System.err.println("Неккоректный индекс");
            return;
        }
        Node node = new Node(value);
        current = top;
        Node prevous;
        if (index == 0) {
            addToBegin(value);
            return;
        }
        if(index == count){
            addToEnd(value);
            return;
        }
        for (int i = 0; i < count; i++) {
            if(i+1 == index){
                prevous = current;
                current = current.getNext();
                prevous.setNext(node);
                node.setNext(current);
                count++;
                return;
            }
            else {
                current = current.getNext();
            }
        }
    }

    public void reverse(){
        Node previous = null;//первой переменной мы присваиваем значение null;
        Node current = top;//переменной присваиваем значение - top
        Node forward;// пустая переменная

        while (current != null) {//пока current не пустой
            //6 итерация - выход из цикла
            forward = current.getNext();//в пустую переменную мы кладем значение top.next
            //1 - 2
            //2 - 3
            //3 - 4
            //4 - 5
            //5 - null;
            current.setNext(previous);//в поле next узла мы кладем ссылку на следующую переменную
            //1 - null(на первой итерации это null
            //2 - 2
            //3 - 2
            //4 - 3
            //5 - 4
            previous = current;//
            //1 - 1
            //2 - 2
            //3 - 3
            //4 - 4
            //5 - 5
            current = forward;
            //1 - 2
            //2 - 3
            //3 - 4
            //4 - 5
            //5 - 5
        }
        forward = top;//
        //1 - 1
        top = tail;
        //1- 5
        tail = forward;
        //5 - 1

    }

    public int getCount(){
        return this.count;
    }
    public boolean contains(int element){
        current = top;
        for (int i = 0; i < count; i++) {
            if (current.getValue() == element) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public int indexOf(int element){
        current = top;
        for (int i = 0; i < count; i++) {
            if (current.getValue() == element) {
                return i;
            } else {
                current = current.getNext();
            }
        }
        return -1;
    }

}
