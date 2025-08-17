import java.util.*;
public class implementation_dequeue{
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque); // 2 1 3 4
        deque.removeFirst();
        System.out.println(deque); // 1 3 4

        System.out.println("first el: " + deque.getFirst()); // 1
        System.out.println("last el: " + deque.getLast()); // 4
    }
}