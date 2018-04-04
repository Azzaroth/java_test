package q9;

public class BinaryTreeExec {

    public static Integer sumOfNodes(BinaryTree binaryTree) {
        return (binaryTree == null) ? 0 :
                sumOfNodes(binaryTree.getLeft()) +
                sumOfNodes(binaryTree.getRight()) +
                binaryTree.getValue();
    }

    public static Integer sumOfBellowNodes(BinaryTree binaryTree) {
        return (sumOfNodes(binaryTree.getLeft())) +
                sumOfNodes(binaryTree.getRight());

    }

    public static void main(String[] args) {
        // Hardcoded binary trees for testing purposes only.
        BinaryTree binaryTree4 = new BinaryTree(7, null, null);
        BinaryTree binaryTree5 = new BinaryTree(8, binaryTree4, null);
        BinaryTree binaryTree6 = new BinaryTree(7, null, null);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree6, binaryTree5);
        BinaryTree binaryTree0 = new BinaryTree(7, binaryTree7, null);
        BinaryTree binaryTree1 = new BinaryTree(2, null, null);
        BinaryTree binaryTree2 = new BinaryTree(1, null, binaryTree0);
        BinaryTree binaryTree3 = new BinaryTree(5, binaryTree1, null);
        BinaryTree binaryTree = new BinaryTree(3, binaryTree3, binaryTree2);

        int result = sumOfNodes(binaryTree);

        // Use this if you don't want to count the "parent" node.
         // int result = sumOfBellowNodes(binaryTree);

        System.out.println("The sum was: " + result);
    }

}
