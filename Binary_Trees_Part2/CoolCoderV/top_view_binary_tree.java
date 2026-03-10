

import java.util.*; //Importing necessary packages
public class top_view_binary_tree{ //Class

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

    static class Info{ //Info class to store node and its horizontal distance
        Node node; //Node
        int hd; //Horizontal Distance
        public Info(Node node, int hd) { //Constructor
            this.node = node; //Node
            this.hd = hd; //Horizontal Distance
        }
    }
    public static void topView(Node root){ //Top View of Binary Tree
        //Level Order
        Queue<Info> q = new LinkedList<>(); //Queue to store nodes and their horizontal distance
        HashMap<Integer, Node> map = new HashMap<>(); //HashMap to store the first node at each horizontal distance

        int min = 0, max = 0; //To keep track of minimum and maximum horizontal distance
        q.add(new Info(root, 0)); //root node with hd = 0
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){ //first time my hd is occuring
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min , curr.hd - 1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for(int i = min; i<=max ; i++){
            System.out.println(map.get(i).data); //Print the top view nodes
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

        Node root = new Node(1); //Object
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root); //Function Call

    }
}

