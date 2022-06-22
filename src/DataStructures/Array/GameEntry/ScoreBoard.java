package DataStructures.Array.GameEntry;

import DataStructures.Array.GameEntry.GameEntry;

public class ScoreBoard {
    private int numberOfEntries;
    private GameEntry[] board;

    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry entry){
        int newScore = entry.getScore();

        if (numberOfEntries < board.length || newScore > board[numberOfEntries - 1].getScore()){
            if (numberOfEntries < board.length) numberOfEntries++;

            int count = numberOfEntries - 1;
            while (count > 0 && newScore > board[count].getScore()){
                board[count] = board[count-1];
                count--;
            }
            board[count] = entry;
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index > numberOfEntries) throw new IndexOutOfBoundsException("Invalid index: " + index);
        GameEntry tempEntry = board[index];

        for (int counter = index; counter < numberOfEntries - 1; counter++) board[index] = board[index + 1];

        board[numberOfEntries - 1] = null;
        numberOfEntries--;

        return tempEntry;
    }
}
