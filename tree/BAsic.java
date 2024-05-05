package src.tree;

public class BAsic {

    public boolean checkBalance(TreeNode root){

        if (root == null) return true;
        int lh = heigth(root.left);
        int rh = heigth(root.right);

        return lh == rh;
    }

    public int heigth(TreeNode root){

        return root.left;

    }
}
