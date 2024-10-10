package Deque.Interface;

public interface DequeInterface<E> {

    boolean insertLast(E value);

    boolean insertFront(E value);

    E getFront();

    E getRear();

    boolean isFull();

    boolean deleteLast();

    boolean deleteFront();

    boolean isEmpty();
}
