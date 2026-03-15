
import java.util.*;

import javax.print.DocFlavor.STRING;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InorderTrav {
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> inorderTrav(TreeNode root) {

        if (root == null)
            return list;

        inorderTrav(root.left);
        list.add(root.val);
        inorderTrav(root.right);
        return list;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTrav obj = new InorderTrav();

        List<Integer> result = obj.inorderTrav(root);

        System.out.println(result);
    }

}
