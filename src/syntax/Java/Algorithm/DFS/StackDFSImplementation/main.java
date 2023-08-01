package syntax.Java.Algorithm.DFS.StackDFSImplementation;

public class main {

    public static void main(String[] args) {

        // Graph
        GraphStackDFS graph = new GraphStackDFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS Graph Traversal using Stack:");
        graph.graphStackDFS(0);

        System.out.println();

        // Tree
        TreeStackDFSNode rootTree = new TreeStackDFSNode(0);
        rootTree.left = new TreeStackDFSNode(1);
        rootTree.left.left = new TreeStackDFSNode(3);
        rootTree.right = new TreeStackDFSNode(2);
        rootTree.right.left = new TreeStackDFSNode(4);

        TreeStackDFS treeDFS = new TreeStackDFS();
        System.out.println("DFS Pre-Order Tree Traversal using Stack:");
        treeDFS.treeStackDFS(rootTree);
    }
}
