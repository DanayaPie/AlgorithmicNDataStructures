package syntax.Java.Algorithm.DFS.RecursionDFSImplementation;

public class TreeRecursiveDFS {

    public void treeRecursiveDFS(TreeRecursiveDFSNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        treeRecursiveDFS(root.left);
        treeRecursiveDFS(root.right);
    }
}

class TreeRecursiveDFSNode {

    int val;
    TreeRecursiveDFSNode left;
    TreeRecursiveDFSNode right;

    public TreeRecursiveDFSNode(int val) {
        this.val = val;
    }
}


