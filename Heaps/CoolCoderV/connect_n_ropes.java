
import java.util.*;

public class connect_n_ropes {
    public static void main(String args[]) {

        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();

            int sum = min + min2;
            cost += sum;

            pq.add(sum);
        }

        System.out.println("Cost of connecting n ropes = " + cost);
    }
}