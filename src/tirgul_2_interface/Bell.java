package tirgul_2_interface;

public class Bell implements Soundable {

    @Override
    public void makeSound() {
        System.out.println("Ding dong");
    }
}
