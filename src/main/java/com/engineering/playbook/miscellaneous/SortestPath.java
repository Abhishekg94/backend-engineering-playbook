package com.engineering.playbook.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SortestPath {
    public int[] shortestPath(int V, int E, int[][] edges) {
        // Build adjacency list: node -> (neighbor, weight)
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new int[]{v, wt});
        }

        // Step 1: Topological sort
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) topoSort(i, visited, st, adj);
        }

        // Step 2: Initialize distances
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0; // src = 0

        // Step 3: Relax edges in topological order
        while (!st.isEmpty()) {
            int node = st.pop();
            if (dist[node] != Integer.MAX_VALUE) {
                for (int[] edge : adj.get(node)) {
                    int v = edge[0];
                    int wt = edge[1];
                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Replace unreachable with -1
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) dist[i] = -1;
        }

        return dist;
    }

    private void topoSort(int node, boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<int[]>> adj) {
        visited[node] = true;
        for (int[] edge : adj.get(node)) {
            int nei = edge[0];
            if (!visited[nei]) topoSort(nei, visited, st, adj);
        }
        st.push(node);
    }

    // Driver
    public static void main(String[] args) {
        SortestPath sol = new SortestPath();
        int V = 6, E = 7;
        int[][] edges = {
                {0,1,2}, {0,4,1}, {4,5,4},
                {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}
        };

        int[] dist = sol.shortestPath(V, E, edges);
        System.out.println(Arrays.toString(dist));
    }
}


