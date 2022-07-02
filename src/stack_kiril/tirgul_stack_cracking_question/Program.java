package stack_kiril.tirgul_stack_cracking_question;

public class Program {
    public static void main(String[] args) {
        StackImplement stackImplement = new StackImplement(4);
        String str = "Yeuda";
        Object[] object = new Object[5];

        stackImplement.push(str);
        stackImplement.push(str);
        System.out.println(stackImplement.pop());
        System.out.println(stackImplement.pop());






    }
}
