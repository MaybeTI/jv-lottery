package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors randomColor, int number) {
        this.color = randomColor;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + getColor() + '\''
                + ", number=" + getNumber()
                + '}';
    }

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
