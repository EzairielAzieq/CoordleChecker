class BST {
    class Node {
        String key;
        Node left, right;
        public Node(String item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void deleteKey(String key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, String key) {
        if (root == null) return root;
        if (key.compareTo(root.key) < 0)
            root.left = deleteRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    String minValue(Node root) {
        String minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void insert(String key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, String key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorder() {
        printInorder(root);
    }

    void printInorder(Node root) {
        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);
    }

    boolean search(String key) {
        root = searchRec(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

    public Node searchRec(Node root, String key) {
        if (root == null || root.key.equals(key))
            return root;
        if (key.compareTo(root.key) < 0)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }
}
