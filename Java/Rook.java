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
        if (isMoveToSameSquare(end)) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (isMoveToSameColorPiece(end)) {
            //if 
            if (end.getPiece().equals(new King(this.getColor(), end))) return true;
            return false;
        }
        
        // Verifica se há peças no caminho, analisando a direção da movimentação
        int xMove = Math.abs(this.currentSquare.getX() - end.getX());
        int yMove = Math.abs(this.currentSquare.getY() - end.getY());
        int xDirection = this.currentSquare.getX() < end.getX() ? 1 : -1;
        int yDirection = this.currentSquare.getY() < end.getY() ? 1 : -1;

        if (xMove > 0) {
            for (int i = 1; i < xMove; i ++) {
                if (board.getSquare(this.currentSquare.getX() + i * xDirection, this.currentSquare.getY()).isOccupied()) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < yMove; i ++) {
                if (board.getSquare(this.currentSquare.getX(), this.currentSquare.getY() + i * yDirection).isOccupied()) {
                    return false;
                }
            }
        }

        this.currentSquare = end;
        return true;
    }
}
