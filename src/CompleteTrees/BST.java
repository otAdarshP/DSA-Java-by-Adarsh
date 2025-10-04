package CompleteTrees;

class BST {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 0; //  Initialize height for new node
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {}

    //  Height utility
    public int height(Node node) {
        if (node == null) {
            return -1; // null node has height -1
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    //  Public insert
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        } else {
            // duplicate value, ignore
            return node;
        }

        // update height after insertion
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    //  Populate from array (unsorted)
    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    //  Populate from sorted array (balanced BST)
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        this.insert(nums[mid]);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    // Check if tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // Display tree
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }
}
