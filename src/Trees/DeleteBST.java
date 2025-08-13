package Trees;

import static Trees.DeleteBST.Node.insert;
import static Trees.DeleteBST.Node.search;

public class DeleteBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node insert (Node root, int data){
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

        public static boolean search (Node root, int data){
            if (root == null){
                return false;
            }

            if (root.data == data){
                return true;
            }
            if (root.data > data){
                return search (root.left, data);
            }
            else{
                return search (root.right, data);
            }
        }

        public static Node delete (Node root, int data){

            if (root.data > data){
                root.left = delete (root.left, data);
            }
            else if (root.data < data){
                root.right = delete (root.right, data);
            }

            else{
                // 1. leaf node deletion
                if (root.left == null && root.right == null){
                    return null;
                }

                // 2. only 1 child exists
                if (root.left == null){
                    return root.right;
                }
                if (root.right ==  null){
                    return root.left;
                }

                // 3. It has 2 children and return the InOrder successor
                Node IS = InOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete (root.right, IS.data); // in the root's right bst, go and delete the node at the InOrderSuccessor position.
            }
            return root;
        }

        public static Node InOrderSuccessor(Node root){
            while (root.left != null){ // check the left side of the right side of the root for the InOrderSuccessor property
                root = root.left;
            }
            return root;
        }

        public static void InOrder (Node root){
            if (root == null){
                return;
            }
            InOrder (root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

    }
    public static void main (String[] args){
        int[] nodes = {2,3,4,5,6,8,1,9};
        Node root = null;

        // Inserting in the BST
        for (int i = 0; i < nodes.length; i++){
            root = insert (root, nodes[i]);
        }

        // Printing in the InOrder way
        Node.InOrder (root);
        System.out.println();

        // Searching in the BST
        if (Node.search(root, 3)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }

        // Deleting from the BST
        Node.delete (root, 5);
        Node.InOrder (root);
    }
}
