package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirst {

    public static void recursiveDepthFirstSearch(int start, List<List<Integer>> adjacencyList, boolean[] visited) {
        //recursive base case if im at visited
        //if not set to visited in list
        //loop through neighbors to see if they are visited

        if (visited[start]) {
            return;
        }

        visited[start] = true;
        System.out.println(start + "= visited");
        List<Integer> neighbors = adjacencyList.get(start);
        for (int neighbor : neighbors) {
            recursiveDepthFirstSearch(neighbor, adjacencyList, visited);
        }
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
        //        [0, 1, 3, 4, 5, 2]

    }
}

