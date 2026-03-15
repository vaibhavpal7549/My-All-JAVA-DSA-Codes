
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class univalued {

    public static boolean isUnivalued(Node root, int value) {
        if (root == null) {
            return true;
        }

        if (root.data != value) {
            return false;
        }

        return isUnivalued(root.left, value) && isUnivalued(root.right, value);
    }

    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);

        boolean result = isUnivalued(root, root.data);

        if(result){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}