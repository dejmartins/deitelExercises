package Turtle;

public class Turtle {
    private boolean isPenDown;

    public boolean isPenDown() {
        return isPenDown;
    }

    public void penDown() {
        isPenDown = !isPenDown;
    }
}
