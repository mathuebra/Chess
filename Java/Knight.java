package Chess.Java;

public class Knight extends Piece{

    public Knight(Color color, Square square) {
        super(color, square);
    }
    
        @Override
    public boolean canMove(Board board, Square end) {
        
        // Não pode ir para a casa que já está
        if (isMoveToSameSquare(end)) {
            return false;
        }

        // Não pode ir para uma casa que já tem uma peça da mesma cor
        if (isMoveToSameColorPiece(end)) {
            return false;
        }

        // A movimentação do cavalo é em L, ou seja, 2 casas em uma direção e 1 na outra
        // Em termos de coordenada, o módulo da diferença em cada eixo tem que ser sempre 2 e 1
        // indicando que andou 2 casas em uma direção e 1 na outra
        int xMove = Math.abs(this.currentSquare.getX() - end.getX());
        int yMove = Math.abs(this.currentSquare.getY() - end.getY());

        if ((xMove == 2 && yMove == 1) || (xMove == 1 && yMove == 2)) {
            this.currentSquare = end;
            return true;
        }

        return false;

    }
    
}
