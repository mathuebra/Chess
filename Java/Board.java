package Chess.Java;

public class Board {
    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j, null);
            }
        }
    }

    public Square getSquare(int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return null;
        }
        return squares[x][y];
    }

    
    
}
