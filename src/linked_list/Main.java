package linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        System.out.println(list);

        // using methods
        System.out.println(list.findKey(9));// return Node print 9 because the to string
        System.out.println(list.isEmpty());
        list.addFirst(5);
        System.out.println(list);



    }
}
