package Assignments.TicTacToe;

public enum Values {
    X("X"),
    O("O"),
    EMPTY(" ");
    private final String value;

    Values(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
