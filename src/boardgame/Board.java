package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows,int collums) {
        if (rows < 1 || collums < 1){
            throw new BoardException("Error creating the board:there must be at least 1 row and column");
        }
        this.rows = rows;
        this.columns = collums;
        pieces = new Piece[rows][collums];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int collum){
        if (!positionExists(row,collum)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][collum];
    }
    public Piece piece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getCollum()];
    }

    public void placePiece(Piece piece,Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("there is a already a piece on position " + position);
        }
        pieces[position.getRow()][position.getCollum()] = piece;
        piece.position = position;
    }

    private Boolean positionExists(int row,int collum){
       return row >= 0 && row < rows && collum >= 0 && collum< columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(),position.getCollum());
    }
    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return (position) != null;
    }

}
