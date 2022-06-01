package Assignments.TicTacToe;

public class TicTacToe {
    private final Board board = new Board();

    public String show() {
        return board.show();
    }

    public void play(Position position) {
        board.play(position);
    }

    public boolean isWon() {
        return board.possibleWins();
    }

    public boolean isDraw() {
        return board.isADraw();
    }

    public int player(){
        return board.player();
    }
}
