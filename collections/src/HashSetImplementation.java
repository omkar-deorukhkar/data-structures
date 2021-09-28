// https://www.geeksforgeeks.org/hashset-in-java/

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(1);

        System.out.println(myHashSet);

        boolean isHashSetEmpty = myHashSet.isEmpty();
        boolean hashSetContains = myHashSet.contains(3);

        System.out.println(hashSetContains);
        System.out.println(isHashSetEmpty);

        myHashSet.remove(4);

        Iterator<Integer> i = myHashSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Integer arr[] = new Integer[myHashSet.size()];
        myHashSet.toArray(arr);

        for(Integer j:arr){
            System.out.println(j);
        }


    }
}
