import java.util.ArrayDeque;

public class ArrayDequeuImplementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> myArrayDeque = new ArrayDeque<Integer>();

        myArrayDeque.offerFirst(2);
        myArrayDeque.offerFirst(3);
        myArrayDeque.offerLast(5);
        myArrayDeque.offerLast(6);

        System.out.println(myArrayDeque);

        System.out.println(myArrayDeque.peek());

        System.out.println(myArrayDeque.pollFirst());
        System.out.println(myArrayDeque.pollLast());
    }
}
