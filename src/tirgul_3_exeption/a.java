package tirgul_3_exeption;

public class a {

    public static void main(String[] args) {
        System.out.println(0*0);
        try {
            System.out.println(9/0);
            System.out.println("print");
        }catch (ArithmeticException e){
            System.out.println("Exeption");
        }

    }
}
