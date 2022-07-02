package binary_tree;

public class NumOfLeaves {

    public static int getNumOfLeaves(BinaryNode<Integer> root){
        if (root == null)
            return 0;
        if (root.getRight() == null && root.getLeft()==null) {
            return 1;
        }
        else return getNumOfLeaves(root.getRight()) + getNumOfLeaves(root.getLeft());
    }


    public static void main(String[] args) {
        BinaryNode<Integer> root = new BinaryNode<Integer>(1);

        root.setLeft(new BinaryNode<Integer>(2));
        root.setRight(new BinaryNode<Integer>(3));
        root.getLeft().setLeft(new BinaryNode<Integer>(4));
        root.getLeft().setRight(new BinaryNode<Integer>(5));

        System.out.println(getNumOfLeaves(root));
    }

}
