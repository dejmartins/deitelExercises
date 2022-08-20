package DSA;

public class CatsAndAMouse {

    public String catAndMouse(int x, int y, int z) {
        int catX = Math.abs(z - x);
        int catY = Math.abs(z - y);
        if (catX < catY) return "Cat A";
        if (catY < catX) return "Cat B";
        return "Mouse C";
    }
}
