import java.util.*;

public class two_sum_bst {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // Inorder traversal -> sorted list
    static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    static int countPairs(Node root1, Node root2, int x) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        inorder(root1, arr1);
        inorder(root2, arr2);

        int i = 0;
        int j = arr2.size() - 1;
        int count = 0;

        while (i < arr1.size() && j >= 0) {

            int sum = arr1.get(i) + arr2.get(j);

            if (sum == x) {
                System.out.println("(" + arr1.get(i) + ", " + arr2.get(j) + ")");
                count++;
                i++;
                j--;
            }
            else if (sum < x) {
                i++;
            }
            else {
                j--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // BST1
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        // BST2
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;

        int ans = countPairs(root1, root2, x);

        System.out.println("Total Pairs = " + ans);
    }
}
