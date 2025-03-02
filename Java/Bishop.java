package Chess.Java;

public class Bishop extends Piece{

    public Bishop(Color color, Square square) {
        super(color, square);
    }

    @Override
    public boolean canMove(Board board, Square end) {
        // O módulo da diferença entre as movimentações entre-eixos deve sempre se manter o mesmo
        // para que o movimento seja diagonal
        // Verifica se a peça está se movendo na diagonal
        if (Math.abs(this.currentSquare.getX() - end.getX()) != Math.abs(this.currentSquare.getY() - end.getY())) {
            return false;
        }

        // Não pode ir para a casa que já está
        if (isMoveToSameSquare(end)) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (isMoveToSameColorPiece(end)) {
            return false;
        }

        // Verifica se há peças no caminho, analisando a direção da movimentação
        int xDirection = this.currentSquare.getX() < end.getX() ? 1 : -1;
        int yDirection = this.currentSquare.getY() < end.getY() ? 1 : -1;
        for (int i = 1; i < Math.abs(this.currentSquare.getX() - end.getX()); i++) {
            if (board.getSquare(this.currentSquare.getX() + i * xDirection, this.currentSquare.getY() + i * yDirection).isOccupied()) {
                return false;
            }
        }

        this.currentSquare = end;

        return true;
    }
}
