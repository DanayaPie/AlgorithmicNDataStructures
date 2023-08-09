package syntax.Java.Algorithm.BFS.QueueBFSImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class TreeQueueBFS {

    public void treeQueueBFS(TreeQueueBFSNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeQueueBFSNode> toBeSeenQueue = new LinkedList<>();
        toBeSeenQueue.add(root);

        while (!toBeSeenQueue.isEmpty()) {
            TreeQueueBFSNode current = toBeSeenQueue.poll();
            System.out.print(current.val + " "); // process current node

            // pre-order traversal -> check left first then right
            if (current.left != null) {
                toBeSeenQueue.add(current.left);
            }
            if (current.right != null) {
                toBeSeenQueue.add(current.right);
            }
        }
    }
}

class TreeQueueBFSNode {

    int val;
    TreeQueueBFSNode left;
    TreeQueueBFSNode right;

    public TreeQueueBFSNode(int val) {
        this.val = val;
    }
}
