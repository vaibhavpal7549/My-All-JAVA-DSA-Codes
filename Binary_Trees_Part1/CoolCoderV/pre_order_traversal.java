

import java.util.*;
public class pre_order_traversal{

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

            public static void preorder(Node root){
                if(root == null){
                    return;
                }
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }

            public static void preorder1(Node root){
                if(root == null){
                    return;
                }
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }

            public static void inorder(Node root){
                if(root == null){
                    return;
                }
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
                
            }

            public static void postorder(Node root){
                if(root ==null){
                    return;
                }
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }

            public static void levelOrder(Node root){
                if(root == null){
                    return;
                }

                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);

                while(!q.isEmpty()){
                    Node currNode = q.remove();
                    if(currNode == null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }else{
                        System.out.print(currNode.data + " ");
                        if(currNode.left != null){
                            q.add(currNode.left);
                        }
                        if(currNode.right != null){
                            q.add(currNode.right);
                        }
                    }
                }
                
            }
            
        }

        
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5 ,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
        // tree.postorder(root);
        // tree.inorder(root);
        // tree.preorder(root);


    }
    

}