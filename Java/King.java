package Chess.Java;

public class King extends Piece{

    public King(Color color, Square square) {
        super(color, square);
    }

    @Override
    public boolean canMove(Board board, Square end) {

        // Não pode ir para a casa que já está
        if(this.currentSquare.getX() == end.getX() && this.currentSquare.getY() == end.getY()) {
            return false;
        }

        // O rei pode se mover uma única casa em qualquer direção
        if (Math.abs(this.currentSquare.getX() - end.getX()) <= 1 && Math.abs(this.currentSquare.getY() - end.getY()) <= 1) {
            this.currentSquare = end;
            return true;
        }

        throw new IllegalStateException("Movimentação do rei deu ERRO!");
    }

}