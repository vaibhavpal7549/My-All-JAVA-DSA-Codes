

public class min_dist_btw_nodes{

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

        public static Node lca2(Node root, int n1, int n2){ //Time Complexity : O(N) Space Complexity: O(N) 
        //base case
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node left_lca = lca2(root.left, n1, n2); //check karo ki kahin leftsubtree mein exist to nahin karta hai
        Node right_lca = lca2(root.right, n1 , n2); //check karo ki kahin rightsubtree mein exist to nahin karta hai

        //left_lca = val = right_lca = null
        if(right_lca == null){
            return left_lca;
        }
        if(left_lca == null){
            return right_lca;
        }
        //left_lca != null && right_lca != null
        return root; //root is the lca of n1 and n2
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        //leftDist = -1 && rightDist = -1
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1); //find the distance
        int dist2 = lcaDist(lca, n2); //find the distance

        return dist1 + dist2;

    }



    public static void main(String[] args) {

        Node root = new Node(1); //Object
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4, n2=6;
        System.out.println(minDist(root, n1, n2));

        

    }
}

