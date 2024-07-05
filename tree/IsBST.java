package src.tree;

public class IsBST {

    public static boolean isValidBST(TreeNode root){


        // base case...
        if (root == null){
            return true;
        }

        if (root.left != null && root.left.val >= root.val) return false;
        if (root.right!=null && root.right.val <= root.val) return false;

        boolean ans = isValidBST(root.left) && isValidBST(root.right);

        return ans;

    }

    // string = "lkshflkjahdsf";
    // prceedure ....


}
