//Connect n ropes with minimum cost
//Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum 
//cost, such that the cost to connect two ropes is equal to the sum of their lengths.

// Sample input : N = 4, arr = [4 3 2 6]
// Sample output : 29

//Sample input : N = 2, arr = [1 2 3]
//Sample output : 9

//Time Complexity : O(n)
//Space Complexity : O(n)

import java.util.*;
public class connect_n_ropes_with_minimumCost {

    public static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i<n; i++){
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1){
            int first = pq.remove();
            int second = pq.remove();
            res += first + second;
            pq.add(first + second);
        }
        return res;
    }
    public static void main(String[] args) {
        int len[] = { 4, 3, 2, 6};
        int size = len.length;
        System.out.println("Total cost for connecting" + "ropes is : " + minCost(len, size));
        
    }
}


