package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

public class main {

    public static void main(String[] args) {

        /**
         *  in order traversal
         */
        InOrderTraversalBinaryTree inorderBinaryTree = new InOrderTraversalBinaryTree();
        inorderBinaryTree.root = new InOrderBinaryTreeNode(1);
        inorderBinaryTree.root.left = new InOrderBinaryTreeNode(2);
        inorderBinaryTree.root.right = new InOrderBinaryTreeNode(3);
        inorderBinaryTree.root.left.left = new InOrderBinaryTreeNode(4);
        inorderBinaryTree.root.left.right = new InOrderBinaryTreeNode(5);

        System.out.println("In order traversal: ");
        inorderBinaryTree.printInorder(inorderBinaryTree.root);
        System.out.println();


        /**
         *  pre order traversal
         */
        PreOrderTraversalBinaryTree preOrderBinaryTree = new PreOrderTraversalBinaryTree();
        preOrderBinaryTree.root = new PreOrderBinaryTreeNode(1);
        preOrderBinaryTree.root.left = new PreOrderBinaryTreeNode(2);
        preOrderBinaryTree.root.right = new PreOrderBinaryTreeNode(3);
        preOrderBinaryTree.root.left.left = new PreOrderBinaryTreeNode(4);
        preOrderBinaryTree.root.left.right = new PreOrderBinaryTreeNode(5);

        System.out.println("Pre order traversal: ");
        preOrderBinaryTree.printPreOrder(preOrderBinaryTree.root);
        System.out.println();


        /**
         *  post order traversal
         */
        PostOrderTraversalBinaryTree postOrderBinaryTree = new PostOrderTraversalBinaryTree();
        postOrderBinaryTree.root = new PostOrderBinaryTreeNode(1);
        postOrderBinaryTree.root.left = new PostOrderBinaryTreeNode(2);
        postOrderBinaryTree.root.right = new PostOrderBinaryTreeNode(3);
        postOrderBinaryTree.root.left.left = new PostOrderBinaryTreeNode(4);
        postOrderBinaryTree.root.left.right = new PostOrderBinaryTreeNode(5);

        System.out.println("Post order traversal: ");
        postOrderBinaryTree.printPostOrder(postOrderBinaryTree.root);
        System.out.println();


        /**
         *  level order recur traversal
         */
        LevelOrderRecursionTraversalBinaryTree lvlOrderRecurBinaryTree = new LevelOrderRecursionTraversalBinaryTree();
        lvlOrderRecurBinaryTree.root = new LevelOrderRecurNode(1);
        lvlOrderRecurBinaryTree.root.left = new LevelOrderRecurNode(2);
        lvlOrderRecurBinaryTree.root.right = new LevelOrderRecurNode(3);
        lvlOrderRecurBinaryTree.root.left.left = new LevelOrderRecurNode(4);
        lvlOrderRecurBinaryTree.root.left.right = new LevelOrderRecurNode(5);

        System.out.println("Level order recur traversal: ");
        lvlOrderRecurBinaryTree.printLevelOrderRecur();
        System.out.println();


        /**
         *  level order queue traversal
         */
        LevelOrderQueueTraversalBinaryTree lvlOrderQueueBinaryTree = new LevelOrderQueueTraversalBinaryTree();
        lvlOrderQueueBinaryTree.root = new LevelOrderQueueNode(1);
        lvlOrderQueueBinaryTree.root.left = new LevelOrderQueueNode(2);
        lvlOrderQueueBinaryTree.root.right = new LevelOrderQueueNode(3);
        lvlOrderQueueBinaryTree.root.left.left = new LevelOrderQueueNode(4);
        lvlOrderQueueBinaryTree.root.left.right = new LevelOrderQueueNode(5);

        System.out.println("Level order queue traversal: ");
        lvlOrderQueueBinaryTree.printLevelOrderQueue();
        System.out.println();
    }
}
