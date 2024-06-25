// package L93ArrayDeque;

// Accessing an element from the head of the deque array: getFirst() & peekFirst() methods are used to get the first element of the deque array.


    import java.util.*;
public class AccessingElement extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());



        // Accessing the last element: getLast() or peekLast() methods are used to print the last element of the deque array.

        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());

    }
}
