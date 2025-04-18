public class build_tree_preorder{

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
        static class BinaryTree{ //Binary Tree Class
            static int idx = -1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
        }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5 ,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}