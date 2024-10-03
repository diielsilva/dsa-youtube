package datastructures.queues;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int size;

    public void enqueue(int value) {
        QueueNode node = new QueueNode(value);

        if(size == 0) {
            first = node;
            last = node;
            size++;
            return;
        }

        last.next = node;
        last = node;
        size++;

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
