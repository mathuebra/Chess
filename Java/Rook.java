package Chess.Java;

public class Rook extends Piece{
    public Rook (Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {

        // Torres não podem se mover na diagonal
        if (start.getX() != end.getX() && start.getY() != end.getY()) {
            return false;
        }

        // Não pode ir para a casa que já está
        if(start.getX() == end.getX() && start.getY() == end.getY()) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (end.getPiece() != null && end.getPiece().getColor() == this.getColor()) {
            return false;
        }

        // Verifica se há peças no caminho
        for (int i = start.getX(); i < end.getX(); i++) {
            if (board.getSquare(i, start.getY()).isOccupied()) {
                return false;
            }
        }
        for (int i = start.getY(); i < end.getY(); i++) {
            if (board.getSquare(start.getX(), i).isOccupied()) {
                return false;
            }
        }

        return true;
    }
}
