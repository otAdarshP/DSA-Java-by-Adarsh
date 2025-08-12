package Trees;
import java.util.Queue;
import java.util.LinkedList;


public class RootFinding {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if (nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BinaryTree.buildTree (nodes);
            newNode.right = BinaryTree.buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder (root.left);
        preOrder(root.right);
    }

    public static void InOrder (Node root){
        // steps:
        // 1. Right subtree; 2. Root; 3. Left subtree

        if (root == null){
            return;
        }
        InOrder (root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    public static void PostOrder (Node root){
        if (root == null){
            return;
        }
        PostOrder (root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }

    // main --> Level Order traversal
    public static void LevelOrder (Node root){
        if (root == null){
            return;
        }

        Queue <Node> queue = new LinkedList <>();
        queue.add (root);
        queue.add (null);

        while (!queue.isEmpty()){
            if (queue == null){
                
            }
            else{

            }
        }

    }
    public static void main (String [] args){
        int [] nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preOrder(root);
        System.out.println(root.data);
    }


}
