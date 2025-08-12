//package Trees;
//
//public class CountNodes {
//    public class Node {
//        int data;
//        Node left;
//        Node right;
//
//        public Node (int data){
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static int nodesSum(Node root) {
//
//        if (root == null){
//            return 0;
//        }
//        int leftNodes = nodesSum (root.left);
//        int rightNodes = nodesSum (root.right);
//
//        return leftNodes + rightNodes + 1;
//    }
//
//    public static void main (String [] args){
//        int [] nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,7,-1,-1};
//        System.out.println(nodesSum (root));
//
//    }
//}
