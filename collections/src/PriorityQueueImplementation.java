// https://www.geeksforgeeks.org/priority-queue-class-in-java-2/
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {

        Queue<Integer> myPQ = new PriorityQueue<Integer>();

        // By default, the priority of smallest element is first, to reverse it,
        // pass Comparator.reverseOrder() in the constructor of the PQ.

        myPQ.offer(24);
        myPQ.offer(5);
        myPQ.offer(64);
        myPQ.offer(36);

        System.out.println(myPQ.peek());

        System.out.println(myPQ.poll());

    }
}
