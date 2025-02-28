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
        for (int i = this.currentSquare.getX(); i < end.getX(); i++) {
            if (board.getSquare(i, this.currentSquare.getY()).isOccupied()) {
                return false;
            }
        }
        for (int i = this.currentSquare.getY(); i < end.getY(); i++) {
            if (board.getSquare(this.currentSquare.getX(), i).isOccupied()) {
                return false;
            }
        }

        this.currentSquare = end;

        return true;
    }
}
