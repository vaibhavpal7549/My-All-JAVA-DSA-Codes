
import java.util.*;

public class nearBy_cars {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            // Ascending order according to distance
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String args[]) {

        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        // Min Heap
        PriorityQueue<Point> pq = new PriorityQueue<>();

        // Calculate distance of every point from origin
        for (int i = 0; i < pts.length; i++) {

            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];

            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        System.out.println("K Closest Points:");

        // Remove k closest points
        for (int i = 0; i < k; i++) {

            Point curr = pq.remove();

            System.out.println(
                "Point " + curr.idx +
                " -> (" + curr.x + ", " + curr.y + ")" +
                " Distance² = " + curr.distSq
            );
        }
    }
}