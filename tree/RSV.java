package src.tree;

import java.util.List;

public class RSV {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

    }


//    public static TreeNode rightView(TreeNode root, int level, List<Integer> ans){
//
//
//
//    }
}
