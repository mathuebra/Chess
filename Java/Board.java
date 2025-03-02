package Chess.Java;

import java.util.HashMap;

public class Board {
    private Square[][] squares;

    private HashMap<String, Piece> blackPieces = new HashMap<>();
    private HashMap<String, Piece> whitePieces = new HashMap<>();


    public Board() {
        squares = new Square[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j, null);
            }
        }
        

        blackPieces.put("P1", new Pawn(Piece.Color.BLACK, squares[6][0])); //pawns
        squares[6][0].setPiece(blackPieces.get("P1"));
        blackPieces.put("P2", new Pawn(Piece.Color.BLACK, squares[6][1]));
        squares[6][1].setPiece(blackPieces.get("P2"));
        blackPieces.put("P3", new Pawn(Piece.Color.BLACK, squares[6][2]));
        squares[6][2].setPiece(blackPieces.get("P3"));
        blackPieces.put("P4", new Pawn(Piece.Color.BLACK, squares[6][3]));
        squares[6][3].setPiece(blackPieces.get("P4"));
        blackPieces.put("P5", new Pawn(Piece.Color.BLACK, squares[6][4]));
        squares[6][4].setPiece(blackPieces.get("P5"));
        blackPieces.put("P6", new Pawn(Piece.Color.BLACK, squares[6][5]));
        squares[6][5].setPiece(blackPieces.get("P6"));
        blackPieces.put("P7", new Pawn(Piece.Color.BLACK, squares[6][6]));
        squares[6][6].setPiece(blackPieces.get("P7"));
        blackPieces.put("P8", new Pawn(Piece.Color.BLACK, squares[6][7]));
        squares[6][7].setPiece(blackPieces.get("P8"));
        blackPieces.put("B1", new Bishop(Piece.Color.BLACK, squares[7][2])); //bishops
        squares[7][2].setPiece(blackPieces.get("B1"));
        blackPieces.put("B2", new Bishop(Piece.Color.BLACK, squares[7][5]));
        squares[7][5].setPiece(blackPieces.get("B2"));
        blackPieces.put("R1", new Rook(Piece.Color.BLACK, squares[7][0])); //rooks
        squares[7][0].setPiece(blackPieces.get("R1"));
        blackPieces.put("R2", new Rook(Piece.Color.BLACK, squares[7][7]));
        squares[7][7].setPiece(blackPieces.get("R2"));
        blackPieces.put("N1", new Knight(Piece.Color.BLACK, squares[7][1])); //knights
        squares[7][1].setPiece(blackPieces.get("N1"));
        blackPieces.put("N2", new Knight(Piece.Color.BLACK, squares[7][6]));
        squares[7][6].setPiece(blackPieces.get("N2"));
        blackPieces.put("K", new King(Piece.Color.BLACK, squares[7][3])); //king
        squares[7][3].setPiece(blackPieces.get("K"));
        blackPieces.put("Q", new Queen(Piece.Color.BLACK, squares[7][4])); //queen
        squares[7][4].setPiece(blackPieces.get("Q"));


        whitePieces.put("P1", new Pawn(Piece.Color.WHITE, squares[1][0])); //pawns
        squares[1][0].setPiece(whitePieces.get("P1"));
        whitePieces.put("P2", new Pawn(Piece.Color.WHITE, squares[1][1]));
        squares[1][1].setPiece(whitePieces.get("P2"));
        whitePieces.put("P3", new Pawn(Piece.Color.WHITE, squares[1][2]));
        squares[1][2].setPiece(whitePieces.get("P3"));
        whitePieces.put("P4", new Pawn(Piece.Color.WHITE, squares[1][3]));
        squares[1][3].setPiece(whitePieces.get("P4"));
        whitePieces.put("P5", new Pawn(Piece.Color.WHITE, squares[1][4]));
        squares[1][4].setPiece(whitePieces.get("P5"));
        whitePieces.put("P6", new Pawn(Piece.Color.WHITE, squares[1][5]));
        squares[1][5].setPiece(whitePieces.get("P6"));
        whitePieces.put("P7", new Pawn(Piece.Color.WHITE, squares[1][6]));
        squares[1][6].setPiece(whitePieces.get("P7"));
        whitePieces.put("P8", new Pawn(Piece.Color.WHITE, squares[1][7]));
        squares[1][7].setPiece(whitePieces.get("P8"));
        whitePieces.put("B1", new Bishop(Piece.Color.WHITE, squares[0][2])); //bishops
        squares[0][2].setPiece(whitePieces.get("B1"));
        whitePieces.put("B2", new Bishop(Piece.Color.WHITE, squares[0][5]));
        squares[0][5].setPiece(whitePieces.get("B2"));
        whitePieces.put("R1", new Rook(Piece.Color.WHITE, squares[0][0])); //rooks
        squares[0][0].setPiece(whitePieces.get("R1"));
        whitePieces.put("R2", new Rook(Piece.Color.WHITE, squares[0][7]));
        squares[0][7].setPiece(whitePieces.get("R2"));
        whitePieces.put("N1", new Knight(Piece.Color.WHITE, squares[7][1])); //knights
        squares[7][1].setPiece(whitePieces.get("N1"));
        whitePieces.put("N2", new Knight(Piece.Color.WHITE, squares[7][6]));
        squares[7][6].setPiece(blackPieces.get("N2"));
        whitePieces.put("K", new King(Piece.Color.WHITE, squares[0][3])); //king
        squares[0][3].setPiece(whitePieces.get("K"));
        whitePieces.put("Q", new Queen(Piece.Color.WHITE, squares[0][4])); //queen
        squares[0][4].setPiece(whitePieces.get("Q"));

    }



    public Square getSquare(int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return null;
        }
        return squares[x][y];
    }


    public void movePiece(Board board, String piece, String square, int player) {

        // Alterei o this.getSquare(0, 0), verificar se está certo
        //blackPieces.get(piece).canMove(board, this.getSquare(0, 0));



        if (player == 0){
            int line = (int)(square.charAt(1) - '1');
            int column = (int)((square.charAt(0) - 'A'));

            System.out.println(line);
            System.out.println(column);
            

            if ((whitePieces.get(piece)).canMove(board, squares[line][column])){
                // TODO
                // colocar null no square atual da peça
                // trocar a posicao da peca -> ja é feito no canMove
                // colocar no square a peça
            }
            
        }

    }




}