package Chess.Java;

public class Pawn extends Piece{

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        
        // Peões só conseguem se mover para frente
        if (start.getX() != end.getX()) return false;

        return true;
    }
    
}
