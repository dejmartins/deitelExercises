package ChapterSeven;

import java.util.Arrays;

public class ClassWork1 {
    public static void main(String[] args) {
        String[][] ticTacToe = new String[3][3];

        ticTacToe[0][0] = "X";
        ticTacToe[0][1] = "O";
        ticTacToe[0][2] = "X";
        System.out.println(ticTacToe[0][0] + " " + ticTacToe[0][1] + " " + ticTacToe[0][2]);

        ticTacToe[1][0] = "X";
        ticTacToe[1][1] = "X";
        ticTacToe[1][2] = "X";
        System.out.println(ticTacToe[1][0] + " " + ticTacToe[1][1] + " " + ticTacToe[1][2]);

        ticTacToe[2][0] = "O";
        ticTacToe[2][1] = "X";
        ticTacToe[2][2] = "O";
        System.out.println(ticTacToe[2][0] + " " + ticTacToe[2][1] + " " + ticTacToe[2][2]);

        for(int counter = 0; counter < ticTacToe.length; counter++)
            System.out.println(Arrays.toString(ticTacToe[counter]));
    }
}
