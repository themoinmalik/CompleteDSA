package src.tree;

import java.util.ArrayList;
import java.util.List;

public class CallingAll {


    public static void main(String[] args) {

        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(null);
        tree.right.right = new TreeNode(null);
        tree.left.left.left = new TreeNode(3);
        tree.right.right.right = new TreeNode(7);



        List<Integer> res = new ArrayList<>();
        Traversal traversal = new Traversal();
//        List<Integer> inorderTrav = traversal.inorderTrav(tree);
//        List<Integer> preorder = traversal.preOrder(tree);
//        List<Integer> postOrder = traversal.postorder(tree);

//        System.out.println(postOrder);

//        int h = traversal.height(tree);
//        System.out.println(h);


//        List<Integer> left = DFS.leftStack(tree);
//        System.out.println(left);

        //
        System.out.println(BFS.levelOrder(tree));
        System.out.println(IsBST.isValidBST(tree));

    }


}
