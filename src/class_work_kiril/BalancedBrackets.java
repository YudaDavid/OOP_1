package class_work_kiril;

import java.util.Stack;

public class BalancedBrackets {

    // First exercise stack

    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<Character>();
        s.push(str.charAt(0));
        for (int i = 1; i < str.length() && !s.isEmpty(); i++) {
            char c = str.charAt(i);
            if (c ==  '('  || c ==  '[' || c ==  '{')
                s.push(str.charAt(i));

            else if (c ==  ')') {
                if (s.peek() != '(' || s.isEmpty()) return false;
            }
            else if (c ==  '}') {
                if (s.peek() != '{' || s.isEmpty()) return false;
            }
            else if (c ==  ']') {
                if (s.peek() != ']' || s.isEmpty()) return false;
            }
        }

        return s.isEmpty();
    }


    public static void main(String[] args) {
        String str = "ab(cd{ef}aa";
        System.out.println(isBalanced(str));

    }
}
