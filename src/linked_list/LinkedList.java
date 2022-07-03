package linked_list;

public class LinkedList {
    private Node head, tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void addLast(int x){
        Node n = new Node(x, null);
        if(head == null) {
            head = tail = n;
        }
        else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void addFirst(int x){
        Node toInsert = new Node(x, null);
        toInsert.next = this.head;
        this.head = this.tail = toInsert;

    }

    public void removeFirst(){
        this.head = this.head.next;
    }

    public void removeX(int x){
        if (this.head == null) return;
        else if (head.data == x) this.head = this.head.next;
        else {
            Node prev = head, current = head.next;
            while (current!= null && current.data != x){
                prev = current;
                current = current.next;
            }
            if (current==null) return;
            else prev.next = current.next;
        }
        size--;

    }

    public boolean isEmpty(){
        if (this.head==null) return true;
        return false;
    }

    // return the node which contain this given key and  null if key doesn't exist in the list
    public Node findKey(int key){
        Node current = this.head;
        while (current!=null){
            if (current.data==key) return current;
            else
                current = current.next;
        }
        return null;
    }

    public int getSize(){
        return this.size;
    }

    public String toString(){
        String ans = "[";
        Node current = head;
        while (current != null){
            ans+= current.data+"->";
            current = current.next;
        }
        ans+= "null]";
        return ans;

    }

    public Node getHead() {
        return this.head;
    }




}
