package stack_kiril.tirgul_stack_cracking_question;

public class StackImplement {
    private Object[] arr;
    private int top;

    public StackImplement(int len){
        arr = new Object[len];
        top=-1;
    }

    public void push(Object object){
        if(top==arr.length)
            return;
        arr[++top]= object;
    }
    public Object pop() throws ArrayIndexOutOfBoundsException{
        if (top==-1)
            return-1;
        return arr[top--];
    }

}
