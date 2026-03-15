
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class duplicate_subtrees {

    static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<Node> result = new ArrayList<>();

    public static String findDuplicates(Node root) {
        if (root == null) {
            return "#";
        }

        String left = findDuplicates(root.left);
        String right = findDuplicates(root.right);

        String subtree = root.data + "," + left + "," + right;

        int count = map.getOrDefault(subtree, 0);

        if (count == 1) {
            result.add(root);
        }

        map.put(subtree, count + 1);

        return subtree;
    }

    public static void printDuplicates(Node root) {
        findDuplicates(root);

        for (Node node : result) {
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(4);
        root.right = new Node(3);

        root.left.left = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(3);

        root.right.left.left = new Node(3);

        printDuplicates(root);
    }
}