public class bst1{

    static class Node{ // Node class
        int data;
        Node left;
        Node right;

        Node(int data){ // Constructor
            this.data = data;
        }
    }

    // Insertion in BST
    // Time Complexity - O(H) where H is the height of the tree
    //Time complexity for inserting the n elements in the tree is O(n*H) where H is the height of the tree
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Searching in BST
    // Time Complexity - O(H) where H is the height of the tree
    public static boolean search(Node root, int key){
        if(root == null) return false;

        if(root.data == key) return true;

        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    // Deletion in BST
    // Time Complexity - O(H) where H is the height of the tree
    // 3 Cases
    public static  Node delete(Node root, int val){
        if(root == null) return null;
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{// vOILA CASE, Matlab yahan par hamaara root mil chuka hai
            //Case 1 - Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            
            //Case 2 - Single Child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //Case 3 - Both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            
        }

        return root;
    }
    // Inorder Traversal
    //Inorder Traversal of a BST gives us the sorted order of the elements in the tree
    // Time Complexity - O(N) where N is the number of nodes in the tree
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        // Left, Root, Right

    }

    // To find the Inorder Successor
    // Inorder Successor is the smallest element in the right subtree of the node to be deleted
    // Time Complexity - O(H) where H is the height of the tree
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
    
        }

        inorder(root);
        System.out.println();


        // if(search(root, 1)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }

        root = delete(root, 1);
        System.out.println();
        System.out.println("Inorder Traversal After Deleting: ");

        inorder(root);
    }
}