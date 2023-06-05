package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderQueueTraversalBinaryTree {

    LevelOrderQueueNode root;

    void printLevelOrderQueue() {

        Queue<LevelOrderQueueNode> queue = new LinkedList<LevelOrderQueueNode>();
        queue.add(root);

        while(!queue.isEmpty()) {

            // remove present head
            LevelOrderQueueNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

}

class LevelOrderQueueNode {

    int data;
    LevelOrderQueueNode left;
    LevelOrderQueueNode right;

    public LevelOrderQueueNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


