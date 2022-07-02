package tirgul_3_Interface_question;

public class Main {
    public static void main(String[] args) {
        Numable[] arr= new Numable[3];
        arr[0]=new Square(3);
        arr[1]=new Circle(4);
        arr[2]=new Square(10);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].convertInt());
        }
    }
}
