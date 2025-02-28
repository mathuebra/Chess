package Chess.Java;

public abstract class Piece {

    public enum Color {
        WHITE, BLACK
    }
    
        private Color color;
    
        public Piece(Color color) {
            this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean canMove(Board board, Square start, Square end);


}
