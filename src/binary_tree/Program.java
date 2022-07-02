package binary_tree;


public class Program {

    public static BinaryNode<Integer> buildTree(){
        BinaryNode<Integer> r = new BinaryNode<Integer>(1);

        // left subtree
        r.setLeft(new BinaryNode<Integer>(2));
        r.getLeft().setLeft(new BinaryNode<Integer>(4));
        r.getLeft().setRight(new BinaryNode<Integer>(5));

        //r.getLeft().getRight().setRight(new BinaryNode<Integer>(16));
        //r.getLeft().getRight().setLeft(new BinaryNode<Integer>(9));


        //r.getLeft().getLeft().setRight(new BinaryNode<Integer>(10));
        //r.getLeft().getLeft().setLeft(new BinaryNode<Integer>(3));


        // right subtree
        r.setRight(new BinaryNode<Integer>(3));
        r.getRight().setLeft(new BinaryNode<Integer>(6));
        r.getRight().setRight(new BinaryNode<Integer>(7));

        //r.getRight().getRight().setRight(new BinaryNode<Integer>(0));
        //r.getRight().getRight().setLeft(new BinaryNode<Integer>(1));

        return r;
    }


    public static BinaryNode<Integer> buildTree2(){
        BinaryNode<Integer> r = new BinaryNode<Integer>(1);

        // left subtree
        r.setLeft(new BinaryNode<Integer>(2));
        r.getLeft().setLeft(new BinaryNode<Integer>(4));
        r.getLeft().setRight(new BinaryNode<Integer>(5));

        //r.getLeft().getRight().setRight(new BinaryNode<Integer>(16));
        //r.getLeft().getRight().setLeft(new BinaryNode<Integer>(9));


        //r.getLeft().getLeft().setRight(new BinaryNode<Integer>(10));
        //r.getLeft().getLeft().setLeft(new BinaryNode<Integer>(3));


        // right subtree
        r.setRight(new BinaryNode<Integer>(3));
        r.getRight().setLeft(new BinaryNode<Integer>(6));
        //r.getRight().setRight(new BinaryNode<Integer>(7));

        //r.getRight().getRight().setRight(new BinaryNode<Integer>(0));
        //r.getRight().getRight().setLeft(new BinaryNode<Integer>(1));

        return r;
    }








    public static int sumNodes(BinaryNode<Integer> root){
       if (root == null)
           return 0;

      return root.getValue() + sumNodes(root.getRight()) + sumNodes(root.getLeft());
    }

    public static int numOfLeavs(BinaryNode<Integer> root){
        if (root == null)
            return 0;
        if (root.getRight() == null && root.getLeft()==null) {
            return 1;
        }
        else return numOfLeavs(root.getRight()) + numOfLeavs(root.getLeft());
    }





    public static void main(String[] args) {


        BinaryNode.preorder(buildTree());
        System.out.println();
        BinaryNode.inorder(buildTree());
        System.out.println();
        BinaryNode.postorder(buildTree());

        /*
        System.out.println();
        System.out.println("leaves: " + numOfLeavs(buildTree()));

        System.out.println(sumNodes(buildTree()));

         */


    }
}
