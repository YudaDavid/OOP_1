package linked_list;

import java.util.Stack;

public class ClassWorkLinkedList {

    // Question 1 - create function that return the k element form the end of the linked list
    // here we use the advantage of the stack
    public static int valueOfK(LinkedList list, int k){
        Stack<Integer> stack = new Stack<Integer>();
        Node current = list.getHead();
        while (current!= null){
            stack.push(current.data);
            current = current.next;
        }
        for (int i=1; i<k; i++ ){
            stack.pop();
        }
        return stack.pop();
    }

    // Question 2
    public static void removeMiddle(LinkedList list){
        int n;
        if (list.getSize()%2 == 0) n = list.getSize() / 2-1; // to find the 1st to remove
        else n = list.getSize()/2+1;
        Node current = list.getHead();
        for (int i=1; i!=n; i++){
            current = current.next;
        }
        list.removeX(current.data);
        if (list.getSize()%2 == 0) {
            current = current.next;
            list.removeX(current.data);
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i=0; i<=10; i++){
            list.addLast(i);
        }
        System.out.println(list);
        System.out.println(valueOfK(list, 2));

        removeMiddle(list);
        System.out.println(list);
    }
}
