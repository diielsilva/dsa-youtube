package datastructures.stacks;

public class Stack {
    private StackNode top;
    private int length;

    public void push(int value) {
        StackNode node = new StackNode(value);

        if(length == 0) {
            top = node;
            length++;
            return;
        }

        node.next = top;
        top = node;
        length++;

    }

    public StackNode getTop() {
        return top;
    }

    public int getLength() {
        return length;
    }
}
