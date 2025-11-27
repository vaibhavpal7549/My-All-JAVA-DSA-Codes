

import java.util.Comparator;
import java.util.PriorityQueue;

public class reverse_heaps {
    public static void main(String[] args) {
        //Descending Order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
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


