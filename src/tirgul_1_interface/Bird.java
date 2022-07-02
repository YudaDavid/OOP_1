package tirgul_1_interface;

public class Bird extends Animal implements Flyable {

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        System.out.println("CifCif");
    }

    @Override
    public void eat() {
        System.out.println("Pip");

    }

    @Override
    public void fly() {
        System.out.println("Flyy");
    }
}