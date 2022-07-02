package tirgul_3_Interface_question;

public class Square extends Shape{
    private int slide;

    public Square(int slide) {
        this.slide = slide;
    }

    @Override
    public int convertInt() {
        return slide*slide;
    }
}
