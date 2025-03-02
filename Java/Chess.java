package Chess.Java;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Chess!");

        System.out.println("explicar regras");

        Board board = new Board();


        System.out.println("digite posicao");
        String movement = scanner.nextLine();
        String[] movementArray = movement.split(" ");
        board.movePiece(board, movementArray[0], movementArray[1]);

        

        /*while(!board.gameEnd()){


        }*/
        scanner.close();
    }
}