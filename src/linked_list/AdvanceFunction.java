package linked_list;

import java.util.Stack;

public class AdvanceFunction {

    public static void clearDuplicate(LinkedList list){
        Node x = list.getHead();
        if (x==null) return;
        while (x.next != null){
            Node y = x.next;
            Node z = x;
            while (y!=null){
                if (y.data == x.data){
                    z.next = y.next;
                    y = y.next;
                }
                else {
                    y = y.next;
                    z = z.next;
                }
            }
            x = x.next;
        }
    }

    public static void reverseList(LinkedList list){
        Node x = list.getHead();
        Stack<Integer> stack = new Stack<Integer>();
        while (x!=null){
            stack.push(x.data);
            x = x.next;
        }
        x = list.getHead();
        while (!(stack.isEmpty())){
            x.data = stack.pop();
            x = x.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addLast(2);
        list.addLast(4);
        list.addLast(2);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        System.out.println(list);
        clearDuplicate(list);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);

    }
}
