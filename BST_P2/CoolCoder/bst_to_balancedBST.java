import java.util.*;

public class bst_to_balancedBST {

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

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal to store sorted values
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // create balanced BST from sorted inorder array
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(inorder.get(mid));

        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    // main function to balance BST
    public static Node balanceBST(Node root) {

        // step 1: get inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // step 2: create balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);

        return root;
    }

    public static void main(String args[]) {

        // Unbalanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
                8
               / \
              6   10
             /      \
            5        11
           /           \
          3             12
        */

        root = balanceBST(root);

        // print preorder of balanced tree
        preorder(root);
    }
}



