package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DepthFirst {

    public static void recursiveDepthFirstSearch(int start, List<List<Integer>> adjacencyList, boolean[] visited) {
//        //recursive base case if im at visited
//        //if not set to visited in list
//        //loop through neighbors to see if they are visited
//
//        if (visited[start]) {
//            return;
//        }
//
//        visited[start] = true;
//        System.out.println(start + "= visited");
//        List<Integer> neighbors = adjacencyList.get(start);
//        for (int neighbor : neighbors) {
//            recursiveDepthFirstSearch(neighbor, adjacencyList, visited);
//        }
    }

    public static void iterativeDepthFirstSearch(int start,List<List<Integer>> adjacencyList, boolean[] visited){
//        //Create a stack.
//        //
//        //Push the starting node onto it.
//        //
//        //While the stack isn't empty:
//        //
//        //    Pop a node.
//        //
//        //    If you've already visited it, skip it.
//        //
//        //    Mark it as visited.
//        //
//        //    Push its unvisited neighbors onto the stack
//        Stack<Integer> nodes = new Stack<>();
//        nodes.push(start);
//
//        while (!nodes.empty()){
//            int node = nodes.pop();
//
//            if(visited[node]){
//                continue;
//            }
//
//            visited[node] = true;
//            System.out.println(node + "= visited");
//            for(int neighbors: adjacencyList.get(node)){
//                if(visited[neighbors]){
//                    continue;
//                }
//                nodes.push(neighbors);
//            }
//        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(Arrays.asList(1, 2));    // 0
        graph.add(Arrays.asList(0, 3, 4));  // 1
        graph.add(Arrays.asList(0, 5));    // 2
        graph.add(Arrays.asList(1));       // 3
        graph.add(Arrays.asList(1, 5));    // 4
        graph.add(Arrays.asList(2, 4));    // 5

        boolean[] visited = new boolean[graph.size()];
        recursiveDepthFirstSearch(0, graph, visited);
        iterativeDepthFirstSearch(0,graph,visited);
        //        [0, 1, 3, 4, 5, 2] recursive
        // 0 → 2 → 5 → 4 → 1 → 3 iteratively

    }
}

