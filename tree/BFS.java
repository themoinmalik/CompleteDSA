package src.tree;

import java.util.*;

public class BFS {


    // level order

    // find the right-hand tree leafs.


    public static List<Integer> levelOrder(TreeNode root){

        List<Integer> result = new ArrayList<>();
        int count= 0;


        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
//        result.add(root.val);
        while (queue.size()>0){

            root = queue.poll();

            while (count == 0){
                count--;
            }
            result.add(root.val);

            if (root.left != null){
                queue.add(root.left);
                count++;
            }
            if (root.right != null){
                queue.add(root.right);
                count++;
            }

        }
        return result;


    }


    public TreeNode leftView(TreeNode root){

        Queue<TreeNode> queue = new PriorityQueue<>();
        return null;

    }


}
