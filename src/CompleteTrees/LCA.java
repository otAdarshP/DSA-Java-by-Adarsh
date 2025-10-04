//package CompleteTrees;
//
//import com.sun.source.tree.Tree;
//
//import javax.swing.tree.TreeNode;
//
//public class LCA {
//    public TreeNode lowestCommmonAncestor (TreeNode root, TreeNode p, TreeNode q){
//        if (root == null || root == p || root == q){
//            return root;
//        }
//
//        TreeNode left = lowestCommmonAncestor(root.left, p, q);
//        TreeNode right = lowestCommmonAncestor(root.right, p, q);
//
//        if (right != null && left != null){
//            return root;
//        }
//        if (left == null){
//            return right;
//        } else{
//            return left;
//        }
//    }
//}
