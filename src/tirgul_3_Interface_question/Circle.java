package tirgul_3_Interface_question;

public class Circle extends Shape{
    int redius;

    public Circle(int redius) {
        this.redius = redius;
    }

    @Override
    public int convertInt() {
        return (int) (Math.PI*redius*redius);
    }
}
