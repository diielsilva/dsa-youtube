package datastructures.stacks;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.getLength());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.getLength());
        System.out.println(stack.getTop().value);
    }
}
