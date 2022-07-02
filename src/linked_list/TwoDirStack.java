package linked_list;

public class TwoDirStack{
    private Node upper;
    private Node lower;
    private Node upStackBottom;
    private Node loStackBottom;

    public TwoDirStack(){
        upper = null;
        lower = null;
    }

    public void pushUpper(int x){
        Node temp = new Node(x, null);
        if (upper == null){
            upper = temp;
            upStackBottom = upper;
            if (loStackBottom != null) upper.next = loStackBottom;
            if (lower != null) lower.next = upStackBottom;
        }else {
            temp.next = upper;
            upper = temp;
        }
    }

    public int popUpper(){
        if (upper == null)
            return -1;
        else{
            int ans = upper.data;
            upper = upper.next;
            return ans;
        }
    }

    public void pushLower(int x){
        Node temp = new Node(x, null);
        if (lower == null){
            lower = temp;
            loStackBottom = lower;
            if (upStackBottom != null) lower.next = upStackBottom;
            if (upper != null) upper.next = loStackBottom;
        }else {
            temp.next = lower;
            lower = temp;
        }

    }


    public int popLower(){
        if (lower == null )
            return -1;
        else{
            int ans = lower.data;
            lower = lower.next;
            return ans;
        }
    }
// יש לשים לב שכשמכניסים רק מאחד הצדדים אז לא ניתן לקבל את הנתונים מהצד השני



    public static void main(String[] args) {
        TwoDirStack twoDirStack = new TwoDirStack();
        twoDirStack.pushUpper(3);
        twoDirStack.pushLower(5);
        twoDirStack.pushLower(6);

        System.out.println(twoDirStack.popLower());
        System.out.println(twoDirStack.popLower());
        System.out.println(twoDirStack.popLower());
        System.out.println(twoDirStack.popLower());


    }


}
