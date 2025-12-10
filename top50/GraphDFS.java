package src.top50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GraphDFS {

    class Graph{
        HashMap<Integer, ArrayList<Integer>> adjList;

        Graph(){
            this.adjList = new HashMap<>();
        }
        Graph(HashMap<Integer,ArrayList<Integer>> adjList){
            this.adjList = adjList;
        }
    }

    public void dfs(Graph graph, int root, Set<Integer> visited){
        if(visited.contains(root)) return;
        else{
            System.out.println(root);
            visited.add(root);
            for(int neighbour : graph.adjList.get(root))
                dfs(graph, neighbour, visited);
        }
    }

    public void dfs(Graph graph, int root){
        Set<Integer> visited = new HashSet<>();
        dfs(graph, root, visited);
    }
}
