package src.tree;

public class BAsic {

    public boolean checkBalance(TreeNode root){

        if (root == null) return true;
        int lh = heigth(root.left);
        int rh = heigth(root.right);

        return lh == rh;
    }

    public int heigth(TreeNode root){
        return 0;
    }

    /// check symmetric...
    public boolean isSymmetric(TreeNode root){
        return check(root, root);
    }

    public boolean check(TreeNode left, TreeNode right){

        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }

        return check(left.left, right.right) && check(left.right, right.left);

    }
}
