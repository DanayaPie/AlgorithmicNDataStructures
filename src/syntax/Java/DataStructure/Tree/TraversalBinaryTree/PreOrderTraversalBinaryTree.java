package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

public class PreOrderTraversalBinaryTree {

    PreOrderBinaryTreeNode root;

    PreOrderTraversalBinaryTree() {
        root = null;
    }

    void printPreOrder(PreOrderBinaryTreeNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printPreOrder(node.left); // recur on left child
        printPreOrder(node.right); // recur on right child
    }
}

class PreOrderBinaryTreeNode {

    int data;
    PreOrderBinaryTreeNode left;
    PreOrderBinaryTreeNode right;

    public PreOrderBinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


