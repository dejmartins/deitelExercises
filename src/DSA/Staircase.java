package DSA;

public class Staircase {
    public static void main(String[] args) {
        drawStairs(5);
    }

    private static void drawStairs(int n) {
        for(int i = 0; i < n; i++){
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
