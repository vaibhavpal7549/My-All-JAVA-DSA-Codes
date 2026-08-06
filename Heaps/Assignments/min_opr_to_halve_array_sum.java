

import java.util.*;

public class min_opr_to_halve_array_sum {

    static int minops(ArrayList<Integer> nums) {

        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.size(); i++) {
            pq.add(-nums.get(i));
        }

        double temp = sum;
        int cnt = 0;

        while (temp > sum / 2.0) {

            int x = -pq.peek();
            pq.remove();

            temp -= Math.ceil(x * 1.0 / 2);

            pq.add(x / 2);

            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(4, 6, 3, 9, 10, 2));

        System.out.println("Array : " + nums);

        int count = minops(nums);

        System.out.println("Minimum Operations = " + count);
    }
}