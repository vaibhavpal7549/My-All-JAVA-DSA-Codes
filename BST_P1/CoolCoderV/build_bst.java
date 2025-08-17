public class build_bst{
    static class Node{ //Node class
        //three values     
        int data;
        Node left; //left subtree ka node, by default ye null hote hain
        Node right; //right subtree ka node, by default ye null hote hain

        Node(int data){ //Constructor
            this.data = data;
        }


    }

    public static Node insert(Node root, int val){ //insert function
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //rigth subtree
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }


    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);

        }
        inorder(root);
        System.out.println ();


    }
}