
import java.util.PriorityQueue;

public class heaps {
    public static void main(String[] args) {
        //Ascending Order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        //Adding the element so it takes O(logn)
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }
    }
}
