
import java.util.*;

public class kth_level_iterative {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to print all nodes at the k-th level using BFS
    public static void printKthLevel(Node root, int k) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // If current level is k, print all nodes at this level
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node current = queue.poll();
                    System.out.print(current.data + " ");
                }
                return; // We don't need to go deeper
            }

            // Otherwise, enqueue the next level
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            level++;
        }
    }

    public static void main(String[] args) {
        // Constructing the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3; // Level to print
        System.out.println("Nodes at level " + k + ":");
        printKthLevel(root, k);
    }
}
