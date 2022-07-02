package class_work_kiril;

import binary_tree.BinaryNode;
import binary_tree.Program;

public class ClassWorkBinTree {


    public static boolean identityTrees(BinaryNode first, BinaryNode second){
        if ( (first == null && second != null) || (first != null && second == null))
                return false;
        else if (first == null && second == null)
            return true;
        boolean isEqual = second.getValue() == first.getValue();
        return isEqual && identityTrees(first.getLeft(), second.getLeft()) && identityTrees(first.getRight(), second.getRight());

    }

    //2
    public static int sumOfNode(BinaryNode<Integer> root){
        if (root.getRight() != null)
            return root.getRight().getValue() + sumOfNode(root.getLeft()) + sumOfNode(root.getRight());
        if (root.getLeft() != null)
            return root.getLeft().getValue() + sumOfNode(root.getLeft()) + sumOfNode(root.getRight());
        return 0;
    }


    public static void replaceWithSum(BinaryNode<Integer> root){
        if(root == null)
            return;
        root.setValue(sumOfNode(root));
        replaceWithSum(root.getRight());
        replaceWithSum(root.getLeft());
    }

    public static void main(String[] args) {
        System.out.println(identityTrees(Program.buildTree(), Program.buildTree2()));
        BinaryNode tree = Program.buildTree();
        System.out.println(sumOfNode(tree));
        replaceWithSum(tree);
        BinaryNode.preorder(tree);

     }
}
