// package L93ArrayDeque;

// Insertion At End: addLast() and offerLast() methods are used to insert an element at the end of the array deque.

import java.util.*;

public class AddLast extends Thread {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);
        ad1.offerLast(10);

        System.out.println(ad1);

    }
}
