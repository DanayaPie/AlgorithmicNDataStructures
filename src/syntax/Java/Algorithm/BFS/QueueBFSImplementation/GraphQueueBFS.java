package syntax.Java.Algorithm.BFS.QueueBFSImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class GraphQueueBFS {

    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // Array of lists of Adjacency List Representation

    public GraphQueueBFS(int v) {
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

    public void graphQueueBFS(int startNode) {
        boolean[] visited = new boolean[V];
        Queue<Integer> toBeSeenQueue = new LinkedList<>();

        toBeSeenQueue.add(startNode);
        visited[startNode] = true;

        while (!toBeSeenQueue.isEmpty()) {
            int current = toBeSeenQueue.poll();
            System.out.print(current + " "); // process current node

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    toBeSeenQueue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
