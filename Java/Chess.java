package Chess.Java;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Chess!");

        // TODO
        // explicar regras K B5
        // [peça] [posição final]
        System.out.println("explicar regras");

        Board board = new Board();


        System.out.println("digite posicao");
        String movement = scanner.nextLine();
        String[] movementArray = movement.split(" ");
        board.movePiece(board, movementArray[0], movementArray[1], 0);

        System.out.println(board.getSquare(7, 3).getPiece().getClass());

        // TODO: 
        // Alternar entre jogadores (0 branco e 1 preto)

        /*while(!board.gameEnd()){


        }*/
        scanner.close();
    }
}