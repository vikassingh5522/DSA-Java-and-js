
// how to create a  Tree 
// we use cconstructor to create a tree
// Manual implementation 


public class node {
    int value;
    node left;
    node right;
    
    // this is the constructor to create a node in the tree
    public node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {

        // creating a tree 
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);

        // printing the tree 
        System.out.println("Root: " + root.value);
        System.out.println("Left Child of Root: " + root.left.value);
        System.out.println("Right Child of Root: " + root.right.value);
        System.out.println("Left Child of Left Child of Root: " + root.left.left.value);
        System.out.println("Right Child of Left Child of Root: " + root.left.right.value);
      
    } 
}
