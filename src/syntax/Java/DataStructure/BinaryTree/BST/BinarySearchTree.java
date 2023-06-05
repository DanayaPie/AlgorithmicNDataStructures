package syntax.Java.DataStructure.BinaryTree.BST;

public class BinarySearchTree {

    BSTNode root;

    public void insert(int data) {

        /**
            iterative insert
         */
//        BSTNode newNode = new BSTNode(data);
//
//        if (root == null) {
//            root = newNode;
//            return;
//        }
//
//        BSTNode prev = null;
//        BSTNode nextTemp = root;
//
//        // find next empty temp
//        while (nextTemp != null) {
//            if (nextTemp.data > data) {
//                prev = nextTemp;
//                nextTemp = nextTemp.left;
//            } else if (nextTemp.data < data) {
//                prev = nextTemp;
//                nextTemp = nextTemp.right;
//            }
//        }
//
//        // set new data
//        if (prev.data > data) {
//            prev.left = newNode;
//        } else {
//            prev.right = newNode;
//        }

        /**
            recursive insert
         */
        root = insertRec(root, data);
    }

    private BSTNode insertRec(BSTNode root, int data) {

        if (root == null) {
            root = new BSTNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public BSTNode searchRec(BSTNode root, int data) {

        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    public void delete(int data) {

        root = deleteRec(root, data);
    }

    private BSTNode deleteRec(BSTNode root, int data) {

        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);

        // if data == root.data
        } else {

            // node w one child or no child
            if (root.left == null) {
                return root.right;
            } else if ( root.right == null) {
                return root.left;
            }

            // node w two children - get inorder successor
            // get smallest in the right subtree
            root.data = minValue(root.right);

            // delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(BSTNode root) {

        int minData = root.data;

        while (root.left != null) {
            minData = root.left.data;
            root = root.left;
        }

        return minData;
    }
}

class BSTNode {

    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
