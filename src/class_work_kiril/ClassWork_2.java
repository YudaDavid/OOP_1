package class_work_kiril;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ClassWork_2 {

    // Question 1
    public static Stack<Integer> flip(Stack<Integer> s){
        Stack<Integer> ans = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        while (!s.isEmpty()) {
            ans.push(s.peek());
            temp.push(s.pop());
        }

        while (!temp.isEmpty()){
            s.push(temp.pop());
        }

        return ans;
    }


    // Question 2
    public static boolean checkPolyndrom(Stack<Integer> s){
        boolean ans = true;
        Stack<Integer> copy = (Stack<Integer>) s.clone();
        Stack<Integer> temp = (Stack<Integer>) s.clone();
        Stack<Integer> inverseStack = new Stack<Integer>();
        while (!temp.isEmpty()){
            inverseStack.push(temp.pop());
        }

        while (!copy.isEmpty()){
            if(copy.pop() != inverseStack.pop())
                ans = false;
        }

        return ans;

    }

    // Question 3
    public static boolean checkPalindromQ(Queue<Integer> queue){
        boolean ans= true;
        Queue<Integer> copy = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        while (!queue.isEmpty()){
            s.push(queue.peek());
            copy.add(queue.poll());
        }
        while ( !copy.isEmpty()){
            if (copy.peek()!= s.pop())
                ans= false;
            queue.add(copy.poll());
        }
        return ans;
    }



    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1);
        System.out.println(flip(s1));
        System.out.println(s1);


        Stack<Integer> s2 = new Stack<Integer>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(2);
        s2.push(1);

        System.out.println(checkPolyndrom(s2));
        System.out.println(s2);


        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        System.out.println(checkPalindromQ(queue));
        System.out.println(queue);
    }
}
