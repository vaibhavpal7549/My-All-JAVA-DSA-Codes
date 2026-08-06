
import java.util.*;

public class kth_largest_el_in_stream{

    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int val : arr) {

            if (min.size() < k) {
                min.add(val);
            } else {

                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }

            if (min.size() >= k) {
                list.add(min.peek());
            } else {
                list.add(-1);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        min = new PriorityQueue<>();

        k = 3;

        int[] arr = {10, 20, 11, 70, 50, 40, 100, 5};

        List<Integer> ans = getAllKthNumber(arr);

        System.out.println("Stream : " + Arrays.toString(arr));
        System.out.println("K = " + k);

        System.out.print("Kth Largest after every insertion : ");

        for (int x : ans) {
            if (x == -1)
                System.out.print("_ ");
            else
                System.out.print(x + " ");
        }

        System.out.println();
    }
}