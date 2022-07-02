package stack_kiril;

public class StackAsArray {
    private Array _arr;
    private int _numOfElements;
    public StackAsArray(Array arr){
        _arr = arr;
        _numOfElements = 0;
    }
    public StackAsArray(){
        this(new DynamicArray());
    }

    public boolean isEmpty() {return _numOfElements == 0;}

    public void push(Object o) {
        _arr.set(_numOfElements, o);
        _numOfElements = _numOfElements+1;
    }
    public Object pop() {
        if (isEmpty()) throw new
                RuntimeException("Cannot pop from an empty stack.");
        _numOfElements = _numOfElements-1;
        Object res = _arr.get(_numOfElements);
        _arr.set(_numOfElements, null);
        return res;
    }


    public boolean isBalace(String str){
        boolean ans=true;
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[') {
                counter += 1;
                this.push(str.charAt(i));
            }
        }
        for (int i = 0; i < counter; i++) {
            pop();
        }
        if (!isEmpty())
            ans=false;
        return ans;
    }
}
