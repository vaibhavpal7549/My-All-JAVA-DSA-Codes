
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class delete_leaf_nodes_with_values {

    public static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3;

        root = deleteLeaves(root, x);

        System.out.println("Tree after deleting leaf nodes:");
        preorder(root);
    }
}