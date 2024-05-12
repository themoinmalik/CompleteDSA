package src.tree;

public class LCA {


    public TreeNode ancestor(TreeNode root, TreeNode p, TreeNode q){


        // base case if root == nulll
        if (root == null) return null;

        if (root == p || root == q) return root;

        // find left node or P,
        TreeNode left = ancestor(root.left, p, q);
        // find right ndoe or Q
        TreeNode right = ancestor(root.right, p, q);

        if (left == null || right == null) return root;
        if (left!=null) return left;

        return right;
    }
}
