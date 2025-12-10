package src.top50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GraphBFS {



    static class Graph{
        HashMap<Integer, ArrayList<Integer>> adjList;

        Graph(){
            this.adjList = new HashMap<>();
        }
        Graph(HashMap<Integer,ArrayList<Integer>> adjList){
            this.adjList = adjList;
        }
    }

    static void bfs(Graph graph, int root){
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(root);
        Set<Integer> visited = new HashSet<>();
        visited.add(root);
        int i = 0;
        while(i < queue.size()){
            int vertex = queue.get(i++);
            System.out.println(vertex);
            for(int neighbor : graph.adjList.get(vertex)){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
