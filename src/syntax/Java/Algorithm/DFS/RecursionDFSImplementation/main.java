package syntax.Java.Algorithm.DFS.RecursionDFSImplementation;

public class main {

    public static void main(String[] args) {

        // Tree
        TreeRecursiveDFSNode rootTree = new TreeRecursiveDFSNode(0);
        rootTree.left = new TreeRecursiveDFSNode(1);
        rootTree.left.left = new TreeRecursiveDFSNode(3);
        rootTree.right = new TreeRecursiveDFSNode(2);
        rootTree.right.left = new TreeRecursiveDFSNode(4);

        System.out.println("DFS Tree Traversal using Recursion:");
        TreeRecursiveDFS treeDFS = new TreeRecursiveDFS();
        treeDFS.treeRecursiveDFS(rootTree);

        System.out.println();

        // Graph
        GraphRecursiveDFS graph = new GraphRecursiveDFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS Tree Traversal using Recursion:");
        graph.graphDFS(0);
    }
}
