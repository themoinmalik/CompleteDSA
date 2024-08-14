//package src.tree;
//
//import java.util.*;
//
//public class BFS {
//
//
//    // level order
//
//    // find the right-hand tree leafs.
//
//
//    public static List<Integer> levelOrder(TreeNode root){
//
//    List<Integer> list = new ArrayList<>();
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.add(root);
//
//    while (!queue.isEmpty()){
//
//        int num = queue.size();
//        for (int i = 0; i < num; i++) {
//
//            TreeNode node = queue.poll();
//            if(i==num-1){
//                list.add(node.val);
//            }
//            if(node.left!=null){
//                queue.add(node.left);
//            }
//            if(node.right!=null){
//                queue.add(node.right);
//            }
//        }
//        return list;
//    }
//
//
////
////    public TreeNode leftView(TreeNode root){
////
////        Queue<TreeNode> queue = new PriorityQueue<>();
////        return null;
////
////    }
//
//
//}}
