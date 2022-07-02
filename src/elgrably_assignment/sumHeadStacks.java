package elgrably_assignment;

import java.util.Stack;

public class sumHeadStacks {

    public static int sumHeadTwoStacks(Stack<Integer> s1, Stack<Integer> s2){
        int ans=-1;
        int sumS1, sumS2;
        sumS1=sumS2=0;
        sumS1+=s1.pop();
        sumS2+=s2.pop();
        while (!(s1.isEmpty() && s2.isEmpty())){
            if (sumS1>sumS2){
                sumS2+=s2.pop();
            }
            else if (sumS1<sumS2){
                sumS1+=s1.pop();
            }
            else if (sumS1==sumS2){
                ans=sumS1;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<Integer>();
        Stack<Integer>s2 = new Stack<Integer>();

        s1.push(8);
        s1.push(6);
        s1.push(4);
        s1.push(2);

        s2.push(5);
        s2.push(4);
        s2.push(3);
        s2.push(2);
        s2.push(1);

        System.out.println(sumHeadTwoStacks(s1, s2));
    }
}
