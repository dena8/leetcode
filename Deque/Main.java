package Deque;

import Deque.impl.MyCircularDeque;

public class Main {
    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(5);
        System.out.println(myCircularDeque.insertLast(1));
        System.out.println(myCircularDeque.insertLast(2));
        System.out.println(myCircularDeque.insertLast(3));
        System.out.println(myCircularDeque.insertLast(4));

        System.out.println(myCircularDeque.insertFront(10));
        System.out.println(myCircularDeque.insertFront(11));

        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.deleteLast());

        System.out.println(myCircularDeque.insertFront(10));
        System.out.println(myCircularDeque.insertFront(11));

        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.deleteLast());



    }
}
