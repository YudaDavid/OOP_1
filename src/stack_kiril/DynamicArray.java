package stack_kiril;

public class DynamicArray implements Array {
    private Object[] _arr;
    public DynamicArray(){
        _arr = new Object[0];
    }
    public int size() {return Integer.MAX_VALUE;}
    public Object get(int i) {
        if (i < _arr.length) return _arr[i];
        else return null;
    }

    public void set(int i, Object data) {
        ensureCapacity(i+1);
        _arr[i] = data;
    }
    public void ensureCapacity(int capacity){
        if (capacity > _arr.length){
            Object[] tmpArr = new Object[capacity];
            for (int j=0; j<_arr.length; j=j+1){
                tmpArr[j] = _arr[j];
            }
            _arr = tmpArr;
        }
    }
}
