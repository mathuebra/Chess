package Chess.Java;

public abstract class Piece {
    
    private Color color;
    protected Square currentSquare;

    
    public Piece(Color color, Square square) {
        this.color = color;
        this.currentSquare = square;
    }

    public enum Color {
        WHITE, BLACK
    }

    public Color getColor() {
        return color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public abstract boolean canMove(Board board, Square end);

}