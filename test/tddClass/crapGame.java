package tddClass;

import ChapterSix.GameOfChance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class crapGame {

    @Test
    public void rollNotEqualsToZeroTest(){
        GameOfChance crapGame = new GameOfChance();
        int roll = GameOfChance.rollDice();
        assertNotEquals(0, roll);
    }

    @Test
    public void randomNumbersWhenDiceRolledTest(){
        int firstRoll = GameOfChance.rollDice();
        int secondRoll = GameOfChance.rollDice();
        assertNotEquals(firstRoll, secondRoll);
    }

    @Test
    public void checkForAWinTest(){
        String status = GameOfChance.status(7);
        assertEquals("You Win", status);
        status = GameOfChance.status(11);
        assertEquals("You Win", status);
    }

    @Test
    public void checkForALossTest(){
        String status = GameOfChance.status(2);
        assertEquals("You Lose, THE HOUSE WINS!", status);
        status = GameOfChance.status(3);
        assertEquals("You Lose, THE HOUSE WINS!", status);
        status = GameOfChance.status(12);
        assertEquals("You Lose, THE HOUSE WINS!", status);
    }

    @Test
    public void checkForAContinueTest(){
        String status = GameOfChance.status(10);
        assertNotEquals("You Win", status);

        status = GameOfChance.status(10);
        assertNotEquals("You Lose, THE HOUSE WINS!", status);
    }

    @Test
    public void checkForAWinAfterContinue(){

        String status = GameOfChance.status(10);
        assertNotEquals("You Continue", status);

        status = GameOfChance.status(10);
        assertEquals("You Win", status);
    }

    @Test
    public void checkForALossAfterContinue(){
        String status = GameOfChance.status(10);
        assertNotEquals("You Continue", status);
        GameOfChance.toContinue();
        status = GameOfChance.status(10);
        assertEquals("You Win", status);
    }

}
