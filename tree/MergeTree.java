package src.tree;

public class MergeTree {


    public TreeNode mergeTree(TreeNode root1, TreeNode root2){

        if (root1 == null) return root2;

        if (root2 == null) return root1;

        root1.left = mergeTree(root1.left, root2.left);
        root1.right = mergeTree(root1.right, root2.right);

        return root1;

    }
}
