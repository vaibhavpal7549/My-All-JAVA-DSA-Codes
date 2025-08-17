public class subTree_another_tree {

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

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null) return true;
        else if(node == null || subRoot == null || node.data != subRoot.data) return false;
        
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    //Alternative (Shorter form):
    public static boolean isIdentical1(Node node, Node subRoot){
    if(node == null && subRoot == null) return true;
    if(node == null || subRoot == null || node.data != subRoot.data) return false;
    return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }


    public static boolean isSubtree(Node root, Node subRoot) {
        //Agar subRoot hai to check karna hai ki root kahin null to nahi hai
        if(root == null){ //base case
            return false;
        }
        //Agar root hai to check karna hai ki subRoot root ke andar hai ya nahi

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }



    public static void main(String[] args) {

        //Original Root
        Node root = new Node(1); //Object
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //SubRoot
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot)); //true

    }
}

