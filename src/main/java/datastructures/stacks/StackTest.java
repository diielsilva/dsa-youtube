package datastructures.stacks;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);

        System.out.println(stack.getLength());
    }
}
