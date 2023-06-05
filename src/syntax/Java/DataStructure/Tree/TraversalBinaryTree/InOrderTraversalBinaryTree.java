package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

public class InOrderTraversalBinaryTree {

    InOrderBinaryTreeNode root;

    InOrderTraversalBinaryTree() {
        root = null;
    }

    void printInorder(InOrderBinaryTreeNode node) {

        if (node == null) {
            return;
        }

        printInorder(node.left); // recur on left child
        System.out.print(node.data + " ");
        printInorder(node.right); // recur on right child
    }
}

class InOrderBinaryTreeNode {

    int data;
    InOrderBinaryTreeNode left;
    InOrderBinaryTreeNode right;

    public InOrderBinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
