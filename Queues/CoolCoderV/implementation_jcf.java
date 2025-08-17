// package Sigma 4.0.DSA.Queues.CoolCoderV;
import java.util.*; //utility package
public class implementation_jcf {
    public static void main(String[] args) {
        //declaration of queue
        // Queue<Integer> q = new LinkedList<>(); //object
        Queue<Integer> q = new ArrayDeque<>(); //object
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}



