// Implements a Hash Set in a linked manner, preserves order
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myLinkedHS = new LinkedHashSet<Integer>();

        myLinkedHS.add(1);
        myLinkedHS.add(2);
        myLinkedHS.add(3);

        myLinkedHS.add(1);

        System.out.println(myLinkedHS);
    }
}
