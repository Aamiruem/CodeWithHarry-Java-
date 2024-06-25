// Removing an element :

// Removing the first element: removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.

// removeFirst() throws an exception if the queue is empty.

// pollFirst() returns null if the queue is empty



    import java.util.*;
public class RemoveElements extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56


        System.out.println("Delete from first 6 and 56 = " + ad1);


        // Removing the last element: removeLast() & pollLast() methods are used to delete an element from the tail of the queue.

        // removeLast() throws an exception if the queue is empty.

        // pollLast() returns null if the queue is empty
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad2.add(6);
        ad2.add(56);
        ad2.add(9);
        ad2.add(10);
        ad2.add(91);
        ad2.add(19);

        ad2.pollLast(); //deletes 19
        ad2.removeLast(); //deletes 91

        System.out.println("Remove from last 19 and 91 = " + ad2);

    }
}
