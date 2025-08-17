
public class lowest_common_ancestor_app2{

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
    
    public static void main(String[] args) {

        Node root = new Node(1); //Object
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4, n2=7;
        System.out.println(lca2(root, n1, n2).data); //1 Output

        

    }
}



