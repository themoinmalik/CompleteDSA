package src.tree;

import java.util.ArrayList;
import java.util.List;

public class DFS {


    // find element...

    // stack call....

    public static List<Integer> leftStack(TreeNode root){

        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;

    }

    public static void help(TreeNode root, List<Integer> list){

        // base...
        if (root == null) return;

        help(root.right, list);
        list.add(root.val);

    }



}
