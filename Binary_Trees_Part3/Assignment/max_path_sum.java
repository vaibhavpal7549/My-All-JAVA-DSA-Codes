

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class max_path_sum {

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPath(Node root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));

        int currentPath = left + right + root.data;

        maxSum = Math.max(maxSum, currentPath);

        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);

        maxPath(root);

        System.out.println("Maximum Path Sum: " + maxSum);
    }
}