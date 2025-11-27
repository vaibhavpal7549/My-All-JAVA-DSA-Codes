/*
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
 */

import java.util.*;
public class Monotonic_ArrayList {

    public static boolean isMonotonic(ArrayList<Integer> al){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i<al.size()-1; i++){
            if(al.get(i)>al.get(i+1)){
                inc = false;;
            }
            if(al.get(i)<al.get(i+1)){
                dec = false;
            }
        }

        return inc || dec;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 2 3 4 5 6 
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);

        boolean res = isMonotonic(height);
        System.out.println(res);


    }
}
