//Given a anumber N. The Task is to generate and print all binary numbers with decimal vaues from
//1 to n
//Sample input 1 : N = 2
// Sample output 1 : 1 10

//Sample input 2 : N = 5
//Sample output 2 : 1 10 11 100 101

//Time Complexity : O(n)
//Space Complexity : O(n)

import java.util.LinkedList;
import java.util.Queue;

public class generate_binary_no {

    static void generate_binary(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            // String s2 = s1;
            q.add(s1+ "0");
            // q.add(s2 + "1");
            q.add(s1 + "1");
        }

    }
    public static void main(String[] args) {
        int n = 10;
        generate_binary(n);
        
    }
}
