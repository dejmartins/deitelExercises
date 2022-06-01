package Turtle;

public class Position {
    private int row;
    private int column;
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    @Override
    public String toString(){
        return String.format("""
                row = %d
                column = %d""",row,column);
    }

    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;
        if(compared.column == this.column && compared.row == this.row){return true;}
        return false;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }
}
