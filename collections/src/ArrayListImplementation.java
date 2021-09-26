// https://www.geeksforgeeks.org/arraylist-in-java/
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");

        myArrayList.add(1,"Z");

        System.out.println(myArrayList.get(0));

        myArrayList.remove(1);
        myArrayList.add("D");

        myArrayList.remove(String.valueOf("D"));

        myArrayList.add("D");
        myArrayList.add("E");
        myArrayList.add("F");

        myArrayList.set(5,"P");

        boolean doesContain = myArrayList.contains("E");

        Iterator<String> iter = myArrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
