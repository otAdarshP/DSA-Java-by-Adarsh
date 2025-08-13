package Trees;

import java.util.ArrayList;

public class RootLeafPaths {
    public static void main (String [] args){
        int [] nodes = {8,5,3,6,10,11,14};

        
    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }

        public static Node insert (Node root, int data){
            if (root == null){
                return new Node (data);
            }
            if (root.data > data){
                root.left = insert (root.left, data);
            }
            if (root.data < data){
                root.right = insert (root.left, data);
            }
            return root;
        }

        public static void printpath(ArrayList<Integer> path){
            for (int i = 0; i < path.size(); i++){
                System.out.println(path.get(i));
            }
        }

        public static void path2Leaf (Node root, ArrayList <Integer> path){
            if (root == null){
                return;
            }

            path.add (root.data);

            if (root.left == null && root.right == null){
                printpath (path);
            }
            else{
                path2Leaf(root.left, path);
                path2Leaf(root.right, path);
            }
            path.remove (path.size()-1);
        }
    }

}
