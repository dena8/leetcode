package Deque.impl;

import java.util.Arrays;
import java.util.Objects;

import Deque.Interface.DequeInterface;

public class MyCircularDeque<E> implements DequeInterface<E> {
    E[] dequue;
    private final int capacity, lastIndex;
    private int front, rear;


    public MyCircularDeque(int capacity) {
        validateCapacity(capacity);
        dequue = (E[]) new Object[capacity];
        this.capacity = capacity;
        this.front = capacity % 2;
        this.rear = front + 1;
        this.lastIndex = capacity - 1;
    }


    @Override
    public boolean insertLast(E value) {
        if (isFull()) return false;
        rear++;

        if (!isInArrRange(rear)) rear = 0;

        if (isFrontEqualRare()) return false;

        this.dequue[rear] = value;
        return true;
    }

    @Override
    public boolean insertFront(E value) {
        if (isFull()) return false;
        front--;

        if (!isInArrRange(front)) front = lastIndex;

        if (isFrontEqualRare()) return false;

        dequue[front] = value;
        return true;

    }

    @Override
    public E getFront() {
        return isInArrRange(front) ? dequue[this.front] : null;
    }

    @Override
    public E getRear() {
        return isInArrRange(rear) ? dequue[this.rear] : null;
    }

    @Override
    public boolean isFull() {
        return Arrays.stream(this.dequue).filter(Objects::nonNull).count() == capacity - 2;
    }

    @Override
    public boolean deleteLast() {
        if (isEmpty() || dequue[rear] == null) return false;

        if (isFrontEqualRare()) rear--;
        if (!isInArrRange(rear)) rear = lastIndex;
        dequue[rear--] = null;
        return true;
    }

    @Override
    public boolean deleteFront() {
        if (isEmpty() || dequue[front] == null) return false;

        if (isFrontEqualRare()) front++;
        if (!isInArrRange(front)) front = 0;
        this.dequue[front++] = null;
        return true;
    }


    @Override
    public boolean isEmpty() {
        return Arrays.stream(this.dequue).filter(Objects::isNull).count() == capacity;
    }

    private boolean isInArrRange(int index) {
        return index >= 0 && index <= lastIndex;
    }

    private boolean isFrontEqualRare() {
        return front == rear;
    }

    private void validateCapacity(int capacity) {
        if (capacity < 4) throw new RuntimeException("Capacity must be grater than 4");
    }
}
