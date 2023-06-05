package syntax.Java.DataStructure.Tree.TraversalBinaryTree;

public class LevelOrderRecursionTraversalBinaryTree {

    LevelOrderRecurNode root;

    public LevelOrderRecursionTraversalBinaryTree() {
        root = null;
    }

    void printLevelOrderRecur() {

        int h = height(root);
        int level;
        for (level = 1; level <= h; level++) {
            printCurrentLvl(root, level);
        }
    }

    private int height(LevelOrderRecurNode root) {

        if (root == null) {
            return 0;
        } else {

            // compute height of each subtree
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            // use larger height
            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }

    private void printCurrentLvl(LevelOrderRecurNode root, int level) {

        if (root == null) {
            return;
        } else if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printCurrentLvl(root.left, level - 1);
            printCurrentLvl(root.right, level - 1);
        }
    }
}

class LevelOrderRecurNode {

    int data;
    LevelOrderRecurNode left;
    LevelOrderRecurNode right;

    public LevelOrderRecurNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
