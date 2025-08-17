import java.util.*;
public class queue_using_deque {

    static class queue{ //class hai
        Deque<Integer> deque = new LinkedList<>();
        //add
        public void add(int data){
            deque.addLast(data);
        }

        //remove
        public int remove(){
            return deque.removeFirst();
        }

        //peek
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        queue q = new queue(); //Object hai
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek : "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        
    }
}
