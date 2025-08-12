package Trees;

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

    public static void main (String [] args){
        int [] nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }


}
