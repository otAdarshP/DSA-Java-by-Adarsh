package NeetCode150.Trees;

public class SubTreeOfAnotherTree {
    public class Node{
        int val;
        Node right;
        Node left;

        public Node (int val){
            this.val = val;
        }
    }
    public boolean isSubTree(Node root, Node subRoot){
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    public boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }
        if (root.val == subRoot.val){
            if (isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right))
                return true;
        }
        return false;
    }
}
