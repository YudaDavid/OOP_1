package tirgul_3_exeption;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork_1 {
        public static void divide(){
            Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int num1= s.nextInt();
            System.out.println("Enter second number: ");
            int num2= s.nextInt();
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Both the input must be value");
        }
        catch (Exception e){
            System.out.println("Both the input must be value");
        }
    }

    public static void main(String[] args) {
        while (true){
            divide();
        }
    }
}
