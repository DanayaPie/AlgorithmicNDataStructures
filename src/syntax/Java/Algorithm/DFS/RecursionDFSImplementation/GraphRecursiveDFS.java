package syntax.Java.Algorithm.DFS.RecursionDFSImplementation;

import java.util.LinkedList;

public class GraphRecursiveDFS {

    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // Array of lists of Adjacency List Representation

    public GraphRecursiveDFS(int v) {
        this.V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>(); // initialized list for each vertex
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w); // add edge from v vertex to w vertex
        adjList[w].add(v); // undirected graph, add edge from w to v vertex as well
    }

    public void graphDFS(int startNode) {
        boolean[] visited = new boolean[V];
        graphRecursiveDFS(startNode, visited);
    }

    private void graphRecursiveDFS(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int neightbor : adjList[current]) {
            if (!visited[neightbor]) {
                graphRecursiveDFS(neightbor, visited);
            }
        }
    }
}
