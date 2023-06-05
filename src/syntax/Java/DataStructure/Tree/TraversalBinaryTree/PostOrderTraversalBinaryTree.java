package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

import javafx.geometry.Pos;

public class PostOrderTraversalBinaryTree {

    PostOrderBinaryTreeNode root;

    void printPostOrder(PostOrderBinaryTreeNode node) {

        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }
}

class PostOrderBinaryTreeNode {

    int data;
    PostOrderBinaryTreeNode left;
    PostOrderBinaryTreeNode right;

    public PostOrderBinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


