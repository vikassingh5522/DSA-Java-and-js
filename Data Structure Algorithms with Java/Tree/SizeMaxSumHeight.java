public class SizeMaxSumHeight {
    int vlue;;
    node left;
    node right;

    public SizeMaxSumHeight(int value) {
        this.vlue = value;
     
    }
    public static void preorder(node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    



    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        

        preorder(root);
        
    }
}
