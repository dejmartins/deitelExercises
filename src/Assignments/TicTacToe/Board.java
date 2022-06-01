package Assignments.TicTacToe;

import java.util.Arrays;

import static Assignments.TicTacToe.Position.*;
import static Assignments.TicTacToe.Values.*;

public class Board {

    private final Values[][] board;
    private boolean isNext;


    public Board(){
        board = new Values[3][3];
        for (Values[] strings : board) {
            Arrays.fill(strings, EMPTY);
        }
    }

    public String show(){
        StringBuilder totalString = new StringBuilder();
        for(Values[] strings : board){
            for(Values string : strings){
                totalString.append(string.getValue());
                totalString.append(" ");
            }
            totalString.append("\n");
        }
        return totalString.toString();
    }

    public void play(Position position) {
        if (position == NORTH_WEST) {
            if(board[0][0] == EMPTY){
                if(!isNext) board[0][0] = X;
                else board[0][0] = O;
                setPosition();
            }
        }
        if (position == Position.NORTH) {
            if(board[0][1] == EMPTY){
                if(!isNext) board[0][1] = X;
                else board[0][1] = O;
                setPosition();
            }
        }
        if (position == NORTH_EAST) {
            if(board[0][2] == EMPTY){
                if(!isNext) board[0][2] = X;
                else board[0][2] = O;
                setPosition();
            }
        }
        if (position == WEST) {
            if(board[1][0] == EMPTY){
                if(!isNext) board[1][0] = X;
                else board[1][0] = O;
                setPosition();
            }
        }
        if (position == CENTER) {
            if(board[1][1] == EMPTY){
                if(!isNext) board[1][1] = X;
                else board[1][1] = O;
                setPosition();
            }
        }
        if (position == EAST) {
            if(board[1][2] == EMPTY){
                if(!isNext) board[1][2] = X;
                else board[1][2] = O;
                setPosition();
            }
        }
        if (position == SOUTH_WEST) {
            if(board[2][0] == EMPTY){
                if(!isNext) board[2][0] = X;
                else board[2][0] = O;
                setPosition();
            }
        }
        if (position == SOUTH) {
            if(board[2][1] == EMPTY){
                if(!isNext) board[2][1] = X;
                else board[2][1] = Values.O;
                setPosition();
            }
        }
        if (position == SOUTH_EAST) {
            if(board[2][2] == EMPTY){
                if(!isNext) board[2][2] = X;
                else board[2][2] = Values.O;
                setPosition();
            }
        }
    }

    private void setPosition(){
        isNext = !isNext;
    }


    public boolean possibleWins() {
        if (board[0][0] == X && board[0][1] == X && board[0][2] == X) return true;
        if (board[0][0] == O && board[0][1] == O && board[0][2] == O) return true;
        if (board[1][0] == X && board[1][1] == X && board[1][2] == X) return true;
        if (board[1][0] == O && board[1][1] == O && board[1][2] == O) return true;
        if (board[2][0] == X && board[2][1] == X && board[2][2] == X) return true;
        if (board[2][0] == O && board[2][1] == O && board[2][2] == O) return true;

        if (board[0][0] == X && board[1][0] == X && board[2][0] == X) return true;
        if (board[0][0] == O && board[1][0] == O && board[2][0] == O) return true;
        if (board[0][1] == X && board[1][1] == X && board[2][1] == X) return true;
        if (board[0][1] == O && board[1][1] == O && board[2][1] == O) return true;
        if (board[0][2] == X && board[1][2] == X && board[2][2] == X) return true;
        if (board[0][2] == O && board[1][2] == O && board[2][2] == O) return true;

        if (board[0][0] == X && board[1][1] == X && board[2][2] == X) return true;
        if (board[0][0] == O && board[1][1] == O && board[2][2] == O) return true;
        if (board[2][0] == O && board[1][1] == O && board[0][2] == O) return true;
        if (board[2][0] == X && board[1][1] == X && board[0][2] == X) return true;
        return false;
    }

    public boolean isADraw(){
        for(Values[] strings : board){
            for(Values string : strings){
                if (string == EMPTY) return false;
            }
        }
        return true;
    }

    public int player(){
        if(!isNext) return 1;
        else return 2;
    }


}
