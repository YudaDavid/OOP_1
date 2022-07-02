package binary_tree;

public class BinSearchTree extends BinaryNode {
    public BinSearchTree(Object value, BinaryNode right, BinaryNode left) {
        super(value, right, left);
    }

    public BinSearchTree(Object value) {
        super(value);
    }

    public BinaryNode find(int key, BinaryNode root){
        BinaryNode<Integer> temp = root;
        BinaryNode<Integer> trucker = null;
        while (temp != null){
            trucker = temp;
            if (temp.getValue() == key) return temp;
            if (key < temp.getValue()) temp = temp.getLeft();
            else temp = temp.getRight();
        }
        return trucker;
    }

    public void insert(int key){
        BinaryNode<Integer> insertNode = new BinaryNode<Integer>(key);
        if (this.value == null) this.value = insertNode.value;
        else {
            BinaryNode<Integer> temp = find(key, this);
            if (key < temp.value) temp.setLeft(insertNode);
            else temp.setRight(insertNode);
        }
    }

    public static int findMinimum(BinaryNode<Integer> root){
        if (root.left==null) return root.value;
        return findMinimum(root.left);
    }

    public static int findMaximum(BinaryNode<Integer> root){
        if (root.right==null) return root.value;
        return findMaximum(root.right);
    }


    public static void main(String[] args) {
        BinSearchTree binSearchTree = new BinSearchTree(3);
        binSearchTree.insert(5);
        binSearchTree.insert(2);
        binSearchTree.insert(90);
        binSearchTree.insert(1);
        binSearchTree.insert(20);
        BinaryNode.inorder(binSearchTree);
        System.out.println();
        System.out.println(findMinimum(binSearchTree));
        System.out.println(findMaximum(binSearchTree));
    }
}
