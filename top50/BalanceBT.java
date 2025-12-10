package src.top50;

import src.Tree.TreeNode;

public class BalanceBT {



    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // Left subtree unbalanced
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // Right subtree unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node unbalanced
        return 1 + Math.max(leftHeight, rightHeight); // Return height
    }

}
