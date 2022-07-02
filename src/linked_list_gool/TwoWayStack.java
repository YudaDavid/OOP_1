package linked_list_gool;

public class TwoWayStack {

    private TwoWayBinNode<Integer> upper;
    private TwoWayBinNode<Integer> lower;

    public TwoWayStack(){
        upper = lower = null;
    }

    public void pushUpper(int n){
        TwoWayBinNode<Integer> temp = new TwoWayBinNode<Integer>(n);
        if ( upper == null ){
            upper = lower = temp;
        }else {
            temp.prev = upper;
            upper.next = temp;
            upper = temp;
        }
    }

    public void pushLower(int n){
        TwoWayBinNode<Integer> temp = new TwoWayBinNode<Integer>(n);
        if ( lower == null ){
            upper = lower = temp;
        }else {
            temp.next = lower;
            lower.prev = temp;
            lower = temp;
        }
    }

    public int popUpper(){
        if (upper == null) return -1;
        int ans = upper.data;
        upper = upper.prev;
        return ans;
    }

    public int popLower(){
        if (lower == null) return -1;
        int ans = lower.data;
        lower = lower.next;
        return ans;
    }


}
