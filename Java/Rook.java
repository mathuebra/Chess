package Chess.Java;

public class Rook extends Piece{
    public Rook (Color color, Square square) {
        super(color, square);
    }

    @Override
    public boolean canMove(Board board, Square end) {

        // Torres não podem se mover na diagonal
        if (this.currentSquare.getX() != end.getX() && this.currentSquare.getY() != end.getY()) {
            return false;
        }

        // Não pode ir para a casa que já está
        if(this.currentSquare.getX() == end.getX() && this.currentSquare.getY() == end.getY()) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (end.getPiece() != null && end.getPiece().getColor() == this.getColor()) {
            return false;
        }
        
        // Verifica se há peças no caminho
        // Vamos confiar que isso aqui da certo
        if (this.currentSquare.getX() == end.getX()) {
            int startY = Math.min(this.currentSquare.getY(), end.getY());
            int endY = Math.max(this.currentSquare.getY(), end.getY());
            for (int i = startY + 1; i < endY; i++) {
            if (board.getSquare(this.currentSquare.getX(), i).isOccupied()) {
                return false;
            }
            }
        } else if (this.currentSquare.getY() == end.getY()) {
            int startX = Math.min(this.currentSquare.getX(), end.getX());
            int endX = Math.max(this.currentSquare.getX(), end.getX());
            for (int i = startX + 1; i < endX; i++) {
            if (board.getSquare(i, this.currentSquare.getY()).isOccupied()) {
                return false;
            }
            }
        }

        this.currentSquare = end;

        return true;
    }
}
