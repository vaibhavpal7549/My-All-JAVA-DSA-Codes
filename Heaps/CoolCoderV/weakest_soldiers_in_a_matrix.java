
import java.util.*;
//Time Complexity: O(nlogn) -> nlogn for adding elements to the priority queue and nlogn for removing elements from the priority queue
public class weakest_soldiers_in_a_matrix {

    //Ascending order -> Badhte Kadam -> Chhote Se Bade
    static class Row implements Comparable<Row> { // Custom class to store the number of soldiers and the index of the row
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) { // Constructor
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {// If the number of soldiers is the same, compare by index
                return this.idx - r2.idx;
            } else { // Otherwise, compare by the number of soldiers
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String args[]) {

        int army[][] = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };

        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;

            for (int j = 0; j < army[0].length; j++) {
                count += (army[i][j] == 1) ? 1 : 0;
            }

            pq.add(new Row(count, i));
        }

        System.out.println("Weakest " + k + " rows are:");

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}