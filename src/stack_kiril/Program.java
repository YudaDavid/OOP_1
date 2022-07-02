package stack_kiril;

public class Program {


    public static void main(String[] args) {
        StackAsArray s = new StackAsArray();
        String str="a((b{c})[d]))e";
        System.out.println(s.isBalace(str));



    }
}
