package src.top50;

import java.util.ArrayList;

public class TreeBFS2 {


    class Tree{
        int data;
        Tree left;
        Tree right;

        Tree(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Tree(int data, Tree left, Tree right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static ArrayList<ArrayList<Integer>> getValuesByLevel(Tree root){
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Object[]> queue = new ArrayList<>();
        queue.add(new Object[]{root, 0});
        int i = 0;
        while(i < queue.size()){
            Tree node = (Tree) queue.get(i)[0];
            Integer level = (Integer) queue.get(i)[1];
            i++;
            if(node == null){
                continue;
            }else{
                if(output.size() <= level) output.add(new ArrayList<Integer>());
                output.get(level).add(node.data);
                queue.add(new Object[]{node.left, level+1});
                queue.add(new Object[]{node.right, level+1});
            }
        }
        return output;
    }
}
