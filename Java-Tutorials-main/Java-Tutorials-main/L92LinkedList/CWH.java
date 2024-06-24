import java.util.*;

public class CWH extends Thread{
    public static void main(String[] args) {

        // Create a LinkedList of Integer type
        LinkedList<Integer> l1 = new LinkedList<>();
        

        // Add elements to the LinkedList
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);

        // Insert 77 at index 5
        l1.add(5, 77);

        // Print the LinkedList
        System.out.println("L1 Linked list : " + l1);
    }
}
