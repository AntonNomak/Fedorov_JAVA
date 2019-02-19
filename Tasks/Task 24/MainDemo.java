package ru.itpark;

public class MainDemo {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.addToBegin(5);
        list.addToBegin(4);
        list.addToBegin(3);
        list.addToBegin(2);
        list.addToBegin(1);

        System.out.println(list.indexOf(1));

    }
}
