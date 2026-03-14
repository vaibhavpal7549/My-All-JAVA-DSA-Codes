class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class mirror_bst {

    public static Node mirror(Node root) { //TC: O(n) where n is the number of nodes in the tree

        if(root == null) {
            return null;
        }

        // mirror left subtree
        Node leftMirror = mirror(root.left);

        // mirror right subtree
        Node rightMirror = mirror(root.right);

        // swap left and right
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        root = mirror(root);

        inorder(root);
    }
}