import java.util.*;

public class root_to_leaf {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert in BST
    public static Node insert(Node root, int val) { // O(logN) in average case, O(N) in worst case
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    public static void inorder(Node root) { // O(N) where N is the number of nodes in the tree
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Print a single path
    public static void printPath(ArrayList<Integer> path) { // O(N) where N is the length of the path
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("null");
    }

    // Print Root to Leaf paths
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) { // O(N) where N is the number of nodes in the tree

        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        // Backtracking step
        path.remove(path.size() - 1);
    }

    public static void main(String args[]) {

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
    }
}