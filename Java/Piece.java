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

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    public abstract boolean canMove(Board board, Square end);

    protected boolean isMoveToSameColorPiece(Square end) {
        return end.getPiece() != null && end.getPiece().getColor() == this.getColor();
    }

    protected boolean isMoveToSameSquare(Square end) {
        return this.currentSquare.getX() == end.getX() && this.currentSquare.getY() == end.getY();
    }

}