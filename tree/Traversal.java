package src.tree;

import java.util.ArrayList;
import java.util.List;

public class Traversal {

    public List<Integer> inorderTrav(TreeNode root){

        List<Integer> res = new ArrayList<>();
        generateRes(root, res);
        return res;

    }

    public void generateRes(TreeNode root, List<Integer> res){

        if (root == null) return;

        generateRes(root.left, res);
        res.add(root.val);
        generateRes(root.right, res);

    }


    public List<Integer> preOrder(TreeNode root){

        List<Integer> res = new ArrayList<>();
        generateResPre(root, res);
        return res;

    }

    public void generateResPre(TreeNode root, List<Integer> res){

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
