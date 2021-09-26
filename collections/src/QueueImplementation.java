// https://www.geeksforgeeks.org/queue-interface-java/
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();

        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);

        System.out.println(myQueue);

        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

        System.out.println(myQueue);
    }
}
