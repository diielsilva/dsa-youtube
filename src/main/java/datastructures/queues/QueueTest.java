package datastructures.queues;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.getSize());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.getFirst().value);
        System.out.println(queue.getLast().value);
        System.out.println(queue.getSize());

    }
}
