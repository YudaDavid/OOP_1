package linked_list_gool;

import linked_list_gool.TwoWayStack;

public class Main {
    public static void main(String[] args) {
        TwoWayStack stacks = new TwoWayStack();
        stacks.pushUpper(3);
        stacks.pushLower(5);
        stacks.pushLower(6);


        // pop from up
        System.out.println("pop from upp:");
        System.out.println(stacks.popUpper());
        System.out.println(stacks.popUpper());
        System.out.println(stacks.popUpper());

        stacks.pushUpper(3);
        stacks.pushLower(5);
        stacks.pushLower(6);

        // pop from bottom and then from up
        System.out.println("pop from bottom:");
        System.out.println(stacks.popLower());
        System.out.println(stacks.popUpper());
        System.out.println(stacks.popLower());




    }
}
