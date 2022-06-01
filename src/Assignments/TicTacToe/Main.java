package Assignments.TicTacToe;

import java.util.Scanner;

import static Assignments.TicTacToe.Position.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe gameOn = new TicTacToe();

        System.out.println("TIC-TAC-TOE");
        System.out.println("""
                Instruction: There are 9 positions to make a move. To make a move, specify the position as follows:
                NW N NE
                W  C  E
                SW S SE
                
                First Player takes "X". Second player takes "O"
                You may begin!
                
                """);


        while(!gameOn.isWon() && !gameOn.isDraw()){
            System.out.printf("Player %d%n", gameOn.player());
            System.out.print("Specify position: ");
            String position = sc.nextLine();
            gameOn.play(positionCheck(position));
            System.out.printf("%s", gameOn.show());
            System.out.println();

            if(gameOn.isWon()){
                System.out.printf("Player %d LOST!", gameOn.player());
            }
            else if(gameOn.isDraw()){
                System.out.println("It's a draw!");
            }
        }
    }

    public static Position positionCheck(String position){
        Position position1 = null;
        switch (position) {
            case "NW" -> position1 = NORTH_WEST;
            case "N" -> position1 = NORTH;
            case "NE" -> position1 = NORTH_EAST;
            case "W" -> position1 = WEST;
            case "C" -> position1 = CENTER;
            case "E" -> position1 = EAST;
            case "SW" -> position1 = SOUTH_WEST;
            case "S" -> position1 = SOUTH;
            case "SE" -> position1 = SOUTH_EAST;
        }
        return position1;
    }
}
