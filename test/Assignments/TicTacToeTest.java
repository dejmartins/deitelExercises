package Assignments;

import Assignments.TicTacToe.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Assignments.TicTacToe.Position.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    TicTacToe game;

    @BeforeEach
    public void startsWith(){
        game = new TicTacToe();
    }

    @Test
    public void testThatTicTacToeClassExixts(){
        assertNotNull(game);
    }

//    @Test
//    public void testThatTheGameHas_XandO_Values(){
//        assertEquals("X", game.playX(0, 0));
//        assertEquals("O", game.playO(0, 0));
//    }

    @Test
    public void testThatGameIsEmptyAtStart(){
        assertEquals("      \n      \n      \n", game.show());
    }

    @Test
    public void testThatPlayerCanPlayToASpecifiedPosition(){
        game.play(NORTH_WEST);
        game.play(NORTH_EAST);
        assertEquals("X   O \n      \n      \n", game.show());
    }

    @Test
    public void testThatFirstPlayerIsX(){
        game.play(CENTER);
        assertEquals("      \n  X   \n      \n", game.show());
    }

    @Test
    public void testThatPositionCannotBeChanged(){
        game.play(CENTER);
        game.play(NORTH);
        game.play(NORTH);
        game.play(NORTH_WEST);
        assertEquals("X O   \n  X   \n      \n", game.show());
    }

    @Test
    public void testThatGameIsWon(){
        game.play(NORTH_WEST);
        game.play(SOUTH);
        game.play(NORTH_EAST);
        game.play(CENTER);
        game.play(NORTH);
        assertEquals("X X X \n  O   \n  O   \n", game.show());
        assertTrue(game.isWon());
    }

    @Test
    public void testThatGameIsADraw(){
        game.play(NORTH_WEST);
        game.play(NORTH);
        game.play(NORTH_EAST);
        game.play(EAST);
        game.play(SOUTH_EAST);
        game.play(SOUTH_WEST);
        game.play(WEST);
        game.play(CENTER);
        game.play(SOUTH);
        assertEquals("X O X \nX O O \nO X X \n", game.show());
        assertTrue(game.isDraw());
    }
}
