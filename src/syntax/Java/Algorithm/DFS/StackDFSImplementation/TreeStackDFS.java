package syntax.Java.Algorithm.DFS.StackDFSImplementation;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class TreeStackDFS {

    public void treeStackDFS(TreeStackDFSNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeStackDFSNode> toBeSeenStack = new Stack<>();
        toBeSeenStack.push(root);

        while (!toBeSeenStack.isEmpty()) {
            TreeStackDFSNode current = toBeSeenStack.pop();
            System.out.print(current.val + " "); // process current node

            // pre-order traversal -> check left first then right
            if (current.right != null) {
                toBeSeenStack.push(current.right);
            }
            if (current.left != null) {
                toBeSeenStack.push(current.left);
            }
        }
    }
}

class TreeStackDFSNode {

    int val;
    TreeStackDFSNode left;
    TreeStackDFSNode right;

    public TreeStackDFSNode(int val) {
        this.val = val;
    }
}
