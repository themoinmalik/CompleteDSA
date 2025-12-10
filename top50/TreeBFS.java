package src.top50;

import java.util.ArrayList;

public class TreeBFS {


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

    public void bfs(Tree root, int i, ArrayList<Tree> queue){
        if(i >= queue.size()) return;
        else {
            Tree poppedNode = queue.get(i);
            if(poppedNode != null){
                System.out.println(poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
            bfs(root, i+1, queue);
        }
    }

    public void bfs(Tree root){
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(root);
        bfs(root, 0, queue);
    }
}
