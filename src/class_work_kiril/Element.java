package class_work_kiril;

public class Element {

        char letter;
        int amount;

    public Element(char letter, int amount) {
        this.letter = letter;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Element{" +
                "letter=" + letter +
                ", amount=" + amount +
                '}';
    }
}
