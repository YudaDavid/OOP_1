package stack_kiril;
import java.util.Stack;

public class Postfix {

    public static int evaluate(String[] arr){
        Stack<Integer> s= new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(a+b);
            }
            else if(arr[i].equals("*") ) {
                int a = s.pop();
                int b = s.pop();
                s.push(a*b);
                }
            else {
                s.push(Integer.parseInt(arr[i]));
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String[] str1= {"3","4","+"};
        String[] str2= {"12","6","3","+","*"};
        System.out.println(evaluate(str1));
        System.out.println(evaluate(str2));
    }
}
