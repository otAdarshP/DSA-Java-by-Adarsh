package Trees;

public class PrintRange {
    public static void main (String[] args){
        int[] nodes = {6,3,5,2,4,1,7,10};
        Node root = null;
        for (int i = 0; i < nodes.length; i++){
            root = Node.insert (root, nodes[i]);
        }
        Node.printRange (root, 3, 8);
    }

    static class Node {
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
                root.left =  insert (root.left, data);
            }
            else{
                root.right = insert (root.right, data);
            }
            return root;
        }

        public static void printRange (Node root, int left, int right){
            // base case:
            if (root == null){
                return;
            }

            if (root.data > left && root.data < right){
                printRange (root.left, left, right);
                System.out.print (root.data + " ");
                printRange(root.right, left, right);
            }
            else if (root.data > right){
                printRange (root.left, left, right);
            }
            else{
                printRange (root.right, left, right);
            }
        }
    }
}
