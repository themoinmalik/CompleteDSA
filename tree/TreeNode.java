package src.tree;

import java.util.Objects;

public class TreeNode {

    int val ;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.val = data;
        this.left = leftNode;
        this.right = rightNode;
    }

    public TreeNode(int data) {
        this.val = data;
    }

    public TreeNode(String o) {

    }
}
