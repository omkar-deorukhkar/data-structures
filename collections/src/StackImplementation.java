// https://www.geeksforgeeks.org/stack-class-in-java/
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println(myStack.peek());

        myStack.pop();
    }
}
