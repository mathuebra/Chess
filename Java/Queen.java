package Chess.Java;

public class Queen extends Piece{

    public Queen(Color color, Square square) {
        super(color, square);
    }
    
    @Override
    public boolean canMove(Board board, Square end) {

        // Não pode ir para a casa que já está
        if(this.currentSquare.getX() == end.getX() && this.currentSquare.getY() == end.getY()) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (end.getPiece() != null && end.getPiece().getColor() == this.getColor()) {
            return false;
        }

        // Verifica se há peças no caminho horizontal ou vertical
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

        // Verifica se há peças no caminho diagonal, analisando a direção da movimentação
        int xDirection = this.currentSquare.getX() < end.getX() ? 1 : -1;
        int yDirection = this.currentSquare.getY() < end.getY() ? 1 : -1;
        for (int i = 1; i < Math.abs(this.currentSquare.getX() - end.getX()); i++) {
            if (board.getSquare(this.currentSquare.getX() + i * xDirection, this.currentSquare.getY() + i * yDirection).isOccupied()) {
                return false;
            }
        }
    }
    
}
