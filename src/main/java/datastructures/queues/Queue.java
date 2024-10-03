package datastructures.queues;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int size;

    public void enqueue(int value) {
        QueueNode node = new QueueNode(value);

        if(isEmpty()) {
            first = node;
            last = node;
            size++;
            return;
        }

        last.next = node;
        last = node;
        size++;

    }

    public QueueNode dequeue() {
        if(isEmpty()) {
            return null;
        }

        if(size == 1) {
            QueueNode aux = first;
            first = null;
            last = null;
            size--;

            return aux;
        }

        QueueNode aux = first;
        first = first.next;
        aux.next = null;
        size--;

        return aux;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public QueueNode getFirst() {
        return first;
    }

    public QueueNode getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }
}
