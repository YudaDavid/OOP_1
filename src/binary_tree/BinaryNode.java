package binary_tree;

public class BinaryNode<T> {
    protected T value;
    protected BinaryNode<T> left;
    protected BinaryNode<T> right;

    public BinaryNode(T value, BinaryNode<T> right, BinaryNode<T> left){
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public BinaryNode(T value){
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public T getValue() {
        return value;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }


    public static void inorder(BinaryNode<Integer> r){
        if (r == null)
            return;

        inorder(r.getLeft());
        System.out.print(r.getValue()+" ");
        inorder(r.getRight());
    }

    public static void preorder(BinaryNode<Integer> r){
        if (r == null)
            return;

        System.out.print(r.getValue()+" ");
        preorder(r.getLeft());
        preorder(r.getRight());
    }

    public static void postorder(BinaryNode<Integer> r) {
        if (r == null)
            return;
        postorder(r.getLeft());
        postorder(r.getRight());
        System.out.print(r.getValue()+" ");

    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
