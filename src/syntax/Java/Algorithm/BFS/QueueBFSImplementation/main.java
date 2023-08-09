package syntax.Java.Algorithm.BFS.QueueBFSImplementation;

public class main {

    public static void main(String[] args) {

        // Graph
        GraphQueueBFS graph = new GraphQueueBFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("BFS Graph Traversal using Queue:");
        graph.graphQueueBFS(0);

        System.out.println();

        // Tree
        TreeQueueBFSNode rootTree = new TreeQueueBFSNode(0);
        rootTree.left = new TreeQueueBFSNode(1);
        rootTree.left.left = new TreeQueueBFSNode(3);
        rootTree.right = new TreeQueueBFSNode(2);
        rootTree.right.left = new TreeQueueBFSNode(4);

        TreeQueueBFS treeBFS = new TreeQueueBFS();
        System.out.println("BFS Pre-Order Tree Traversal using Queue:");
        treeBFS.treeQueueBFS(rootTree);
    }
}
