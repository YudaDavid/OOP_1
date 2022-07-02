package tirgul_2_interface;

public class Main {

    public static void main(String[] args) {
        Soundable[] arr = new Soundable[3];
        arr[0]= new Bell();
        arr[1]= new Dog();
        for (int i = 0; i < arr.length ; i++) {
            arr[i].makeSound();
        }
    }
}
