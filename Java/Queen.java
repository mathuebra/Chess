package Chess.Java;

public class Queen extends Piece{

    public Queen(Color color, Square square) {
        super(color, square);
    }
    
    @Override
    public boolean canMove(Board board, Square end) {

        // Rainha não precisa de verificação, basta identificar se o movimento é diagonal ou reto
        // e instanciar as peças correspondentes para verificar se o movimento é válido
        int xMove = Math.abs(this.currentSquare.getX() - end.getX());
        int yMove = Math.abs(this.currentSquare.getY() - end.getY());

        // Se o movimento for diagonal
        if (xMove == yMove) {
            Bishop moveTest = new Bishop(this.getColor(), this.currentSquare);
            return moveTest.canMove(board, end);

        // Se o movimento for reto
        } else if (xMove == 0 || yMove == 0) {
            Rook moveTest = new Rook(this.getColor(), this.currentSquare);
            return moveTest.canMove(board, end);
        }

        throw new IllegalStateException("Movimentação da rainha deu ERRO!"); 
    }
    
}
