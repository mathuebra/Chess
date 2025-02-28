package Chess.Java;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        // O módulo da diferença entre as movimentações entre-eixos deve sempre se manter o mesmo
        // para que o movimento seja diagonal
        // Verifica se a peça está se movendo na diagonal
        if (Math.abs(start.getX() - end.getX()) != Math.abs(start.getY() - end.getY())) {
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

        // Verifica se há peças no caminho, analisando a direção da movimentação
        int xDirection = start.getX() < end.getX() ? 1 : -1;
        int yDirection = start.getY() < end.getY() ? 1 : -1;
        for (int i = 1; i < Math.abs(start.getX() - end.getX()); i++) {
            if (board.getSquare(start.getX() + i * xDirection, start.getY() + i * yDirection).isOccupied()) {
                return false;
            }
        }

        return true;
    }
}
