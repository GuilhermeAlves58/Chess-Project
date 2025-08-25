package boardgame;

public class Board {
    private int rows;
    private int collum;
    private Piece[][] pieces;

    public Board(int rows,int collums) {
        this.rows = rows;
        this.collum = collums;
        pieces = new Piece[rows][collums];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollum() {
        return collum;
    }

    public void setCollum(int collum) {
        this.collum = collum;
    }

    public Piece piece(int row, int collum){
        return pieces[row][collum];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getCollum()];
    }
}
