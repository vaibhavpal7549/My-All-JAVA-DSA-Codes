//We have an integer k and a queue of integers, we need to reverse the order of the first k
// elements of the queue, leaving the order elements in the same relative order.

//Sample input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90 , 100], k = 5
//Sample output 1 : [50, 40, 30, 20, 10, 60, 80, 90, 100]



import java.util.*;

public class reversing_first_k_el_queue {
    
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k < 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first K elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Enqueue back the stack elements
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Step 3: Move the remaining elements (size - k) to the back to maintain order
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.offer(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Collections.addAll(queue, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        int k = 5;

        System.out.println("Original Queue: " + queue);
        queue = reverseFirstK(queue, k);
        System.out.println("Modified Queue: " + queue);
    }
}

