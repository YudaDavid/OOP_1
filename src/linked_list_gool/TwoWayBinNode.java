package linked_list_gool;

public class TwoWayBinNode<T> {
    T data;
    TwoWayBinNode<T> next;
    TwoWayBinNode<T> prev;

    public TwoWayBinNode(T data){
        this.data = data;
        next = prev = null;
    }

    public TwoWayBinNode(T data, TwoWayBinNode<T> prev, TwoWayBinNode<T> next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(TwoWayBinNode<T> next) {
        this.next = next;
    }

    public void setPrev(TwoWayBinNode<T> prev) {
        this.prev = prev;
    }


    public T getData() {
        return data;
    }

    public TwoWayBinNode<T> getNext() {
        return next;
    }

    public TwoWayBinNode<T> getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        if (data == null) return "null";
        else if (next != null) return data + ">>"+ next.toString();
        else return data+">>null";
    }
}
