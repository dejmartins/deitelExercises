package Turtle;

public class Pen {
    private boolean isDown;

    public void up(){
        isDown = false;
    }
    public void down(){
        isDown = true;
    }
    public boolean isDown(){
        return isDown;
    }
}
