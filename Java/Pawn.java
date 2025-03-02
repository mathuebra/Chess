package Chess.Java;

public class Pawn extends Piece{

    public Pawn(Color color, Square square) {
        super(color, square);
    }

    @Override
    public boolean canMove(Board board, Square end) {
        
        // Não pode ir para a casa que já está
        if (this.currentSquare.getX() == end.getX() && this.currentSquare.getY() == end.getY()) {
            return false;
        }

        // Peão tem diferentes movimentações dependendo da cor
        if (this.getColor() == Color.WHITE) {
            // Peão branco só pode se mover para frente
            if (this.currentSquare.getX() == end.getX() && this.currentSquare.getY() + 1 == end.getY()) {
                this.currentSquare = end;
                return true;
            }
            // Peão branco pode se mover duas casas para frente na primeira jogada
            if (this.currentSquare.getX() == end.getX() && this.currentSquare.getY() + 2 == end.getY() && this.currentSquare.getY() == 1) {
                this.currentSquare = end;
                return true;
            }
            // Peão branco pode se mover na diagonal para capturar peças
            if (Math.abs(this.currentSquare.getX() - end.getX()) == 1 && this.currentSquare.getY() + 1 == end.getY()) {
                if(end.getPiece() != null && end.getPiece().getColor() != this.getColor()) {
                    this.currentSquare = end;
                    return true;
                }
            }
        } else {
            // Peão preto só pode se mover para trás
            if (this.currentSquare.getX() == end.getX() && this.currentSquare.getY() - 1 == end.getY()) {
                this.currentSquare = end;
                return true;
            }
            // Peão preto pode se mover duas casas para trás na primeira jogada
            if (this.currentSquare.getX() == end.getX() && this.currentSquare.getY() - 2 == end.getY() && this.currentSquare.getY() == 6) {
                this.currentSquare = end;
                return true;
            }
            // Peão preto só pode se mover para trás e para as diagonais
            if (Math.abs(this.currentSquare.getX() - end.getX()) == 1 && this.currentSquare.getY() - 1 == end.getY()) {
                this.currentSquare = end;
                return true;
            }
        }

        throw new IllegalStateException("Movimentação do peão deu ERRO!");
    }
    
}
