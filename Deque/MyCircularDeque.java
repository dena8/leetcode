package Deque;

import Deque.Interface.DequeInterface;

public class MyCircularDeque<E> implements DequeInterface {
    E[] dequue;
    private int front, rear;


    public MyCircularDeque(int capacity) {
    }

    @Override
    public boolean insertLast(int value) {
        return false;
    }

    @Override
    public boolean insertFront(int value) {
        return false;
    }

    @Override
    public int getFront() {
        return 0;
    }

    @Override
    public int getRear() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean deleteLast() {
        return false;
    }
}
