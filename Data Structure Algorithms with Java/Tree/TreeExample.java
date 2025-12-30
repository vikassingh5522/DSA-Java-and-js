class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeExample {
    // Preorder Traversal (Root, Left, Right)
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Build Tree
        //       10
        //      /  \
        //     5    20

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        preorder(root); // Output: 10 5 20
    }
}
