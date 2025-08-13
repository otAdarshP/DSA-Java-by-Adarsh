package Trees;

import static Trees.SearchBTS.Node.InOrder;
import static Trees.SearchBTS.Node.insert;

public class SearchBTS {
    public static void main (String [] args){
        int[] nodes = {5,2,3,4,6,1};
        Node root = null; // initialize the root node to null

        for (int i = 0; i < nodes.length; i++){
            root = insert (root, nodes[i]);
        }
        InOrder(root);
        System.out.println();

        if (Node.Search (7, root)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }

    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // insert nodes before searching for them
        public static Node insert (Node root, int  data){
            if (root == null){
                return new Node (data);
            }
            if (root.data > data){
                root.left = insert (root.left, data);
            }
            if (root.data < data){
                root.right = insert (root.right, data);
            }
            return root;
        }

        public static boolean Search (int keyVal, Node root){
            if (root == null){
                return false;
            }
            if (root.data == keyVal){
                return true;
            }
            if (root.data > keyVal){
                return Search (keyVal, root.left);
            }
            else {
                return Search (keyVal, root.right);
            }
        }

        public static void InOrder (Node root){
            if (root == null){
                return;
            }
            InOrder (root.left);
            System.out.print(root.data + " ");
            InOrder (root.right);
        }
    }

}
