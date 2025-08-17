

public class height_of_tree{

    static class Node{ //Node class
        int data;
        Node left;
        Node right;
        public Node(int data) { //Constructor
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int height(Node root){ //ek single parameter aaega // jo ki hai root node
        //base case
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        int root_height = Math.max(lh, rh) + 1;

        return root_height;
    }

    public static int count(Node root){
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    
    public static void main(String[] args) {

        Node root = new Node(1); //Object
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        System.out.println(sumOfNodes(root));

    }
}

