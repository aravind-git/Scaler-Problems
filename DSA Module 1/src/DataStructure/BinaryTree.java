package DataStructure;
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    public BinaryTree() {
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Inserting nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        // Printing the inorder traversal of the tree
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println();
        System.out.println("Preorder traversal:");
        tree.preorder();
    }
    public void insert(int data) {
        root = insertRec(root, data);
    }
    // A recursive function to insert a new node with the given data
    private Node insertRec(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }
        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        // Return the unchanged node pointer
        return root;
    }
    // Method to print the inorder traversal of the tree
    public void inorder() {
        inorderRec(root);
    }
    public void preorder() {
        preorderRec(root);
    }
    // A utility function to do inorder traversal of the tree
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
}
