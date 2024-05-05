package src.tree;

import java.util.ArrayList;
import java.util.List;

public class CallingAll {


    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);

        tree.left.left = new TreeNode(5);

        List<Integer> res = new ArrayList<>();

        Traversal traversal = new Traversal();
        List<Integer> inorderTrav = traversal.inorderTrav(tree);
        List<Integer> preorder = traversal.preOrder(tree);
        List<Integer> postOrder = traversal.postorder(tree);

//        System.out.println(postOrder);

        int h = traversal.hight(tree);
        System.out.println(h);

    }


}
