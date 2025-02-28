package Chess.Java;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Square[][] squares;

    private HashMap<String, Piece> blackPieces = new HashMap<>();


    public Board() {
        squares = new Square[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j, null);
            }
        }
        
        blackPieces.put("P1", new Pawn(Piece.Color.BLACK, squares[6][0])); //pawns
        blackPieces.put("P2", new Pawn(Piece.Color.BLACK, squares[6][1]));
        blackPieces.put("P3", new Pawn(Piece.Color.BLACK, squares[6][2]));
        blackPieces.put("P4", new Pawn(Piece.Color.BLACK, squares[6][3]));
        blackPieces.put("P5", new Pawn(Piece.Color.BLACK, squares[6][4]));
        blackPieces.put("P6", new Pawn(Piece.Color.BLACK, squares[6][5]));
        blackPieces.put("P7", new Pawn(Piece.Color.BLACK, squares[6][6]));
        blackPieces.put("P8", new Pawn(Piece.Color.BLACK, squares[6][7]));
        blackPieces.put("B1", new Bishop(Piece.Color.BLACK, squares[7][2])); //bishops
        blackPieces.put("B2", new Bishop(Piece.Color.BLACK, squares[7][5]));
        blackPieces.put("R1", new Rook(Piece.Color.BLACK, squares[7][0])); //rooks
        blackPieces.put("R2", new Rook(Piece.Color.BLACK, squares[7][7]));

    }



    public Square getSquare(int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return null;
        }
        return squares[x][y];
    }


    public void movePiece(String piece, String square) {

        
    }



    
    
}
