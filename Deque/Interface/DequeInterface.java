package Deque.Interface;

public interface DequeInterface {

    boolean insertLast(int value);

    boolean insertFront(int value);

    int getFront();

    int getRear();

    boolean isFull();

    boolean deleteLast();
}
