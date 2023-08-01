package syntax.Java.Algorithm.DFS.StackDFSImplementation;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Stack;

public class GraphStackDFS {

    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // Array of lists of Adjacency List Representation

    public GraphStackDFS(int v) {
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

    public void graphStackDFS(int startNode) {
        boolean[] visited = new boolean[V];
        Stack<Integer> toBeSeenStack = new Stack<>();

        toBeSeenStack.push(startNode);
        visited[startNode] = true;

        while (!toBeSeenStack.isEmpty()) {
            int current = toBeSeenStack.pop();
            System.out.print(current + " "); // process current node

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    toBeSeenStack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
