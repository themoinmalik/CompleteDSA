package src.Tree;

import java.util.ArrayList;
import java.util.List;

public class Traversal {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(preOrder(root));

    }

    public static List<Integer> inorderTrav(TreeNode root){

        List<Integer> res = new ArrayList<>();
        generateRes(root, res);
        return res;

    }

    public static void generateRes(TreeNode root, List<Integer> res){

        if (root == null) return;

        generateRes(root.left, res);
        res.add(root.val);
        generateRes(root.right, res);

    }


    public static List<Integer> preOrder(TreeNode root){

        List<Integer> res = new ArrayList<>();
        generateResPre(root, res);
        return res;

    }

    public static void generateResPre(TreeNode root, List<Integer> res){

        if (root == null) return;

        res.add(root.val);
        generateResPre(root.left, res);
        generateResPre(root.right, res);
    }

    public List<Integer> postorder(TreeNode root){

        List<Integer> res = new ArrayList<>();
        generatePostOrder(root, res);
        return res;

    }

    void generatePostOrder(TreeNode root, List<Integer> res){

        if (root == null) return;

        generatePostOrder(root.left, res);
        generatePostOrder(root.right, res);
        res.add(root.val);

    }


    public int hight(TreeNode root){

        if (root == null) return 0;

        int l = hight(root.left);
        int r = hight(root.right);
        return 1+ Math.max(l,r);
    }


}
