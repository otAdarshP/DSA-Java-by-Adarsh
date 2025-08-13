package Trees;

import static Trees.InsertBST.Node.insert;

public class InsertBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node insert (Node root, int keyValue){
            if (root == null){
                root = new Node (keyValue);
                return root;
            }
            if (root.data > keyValue){
                root.left = insert (root.left, keyValue);
            }
            else{
                root.right = insert (root.right, keyValue);
            }
            return root;
        }
    }

    // to check if the tree is built correctly or not, we will use the InOrder traversal methodology.
    public static void InOrder (Node root){
        // base case:
        if (root == null){
            return;
        }
        InOrder (root.left);
        System.out.print (root.data + " ");
        InOrder (root.right);
    }

    public static void main (String[] args){
        int[] nodes =  {5,1,3,2,4,7};
        Node root = null;

        for (int i = 0; i < nodes.length; i++){
            root = insert (root, nodes[i]);
        }

        InOrder(root);
        System.out.println();
    }
}
