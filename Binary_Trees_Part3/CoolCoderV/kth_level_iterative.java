import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class kth_level_iterative {

    public static void printKthLevel(Node root, int k) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            // If we are at the kth level, print all nodes at this level
            //poll means to remove the head of the queue and return it
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node curr = q.poll();
                    System.out.print(curr.data + " ");
                }
                return;
            }
            // Process the next level
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            level++;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;

        printKthLevel(root, k);
    }
}