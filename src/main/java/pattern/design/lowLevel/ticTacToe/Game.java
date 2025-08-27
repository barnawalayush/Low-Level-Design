package pattern.design.lowLevel.ticTacToe;

import java.util.*;

public class Game {
    Deque<Player> players;
    Board board;

    public Game(int size){
        initializeGame(size);
    }

    public void startGame(){
        boolean isWinner = false;
        // Game logic to start the game

        System.out.println("Game started with board size: " + board);

        while(!isWinner) {
            board.printBoard();
            Player currentPlayer = players.poll();

            System.out.print("Please enter your move row, column: ");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(",");
            int row = Integer.parseInt(inputs[0].trim());
            int col = Integer.parseInt(inputs[1].trim());

            try {
                board.placePiece(row, col, currentPlayer.getPieces());
                players.offer(currentPlayer);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ". Try again.");
                players.offerFirst(currentPlayer); // Re-add the player to the front of the queue
                continue;
            }

            isWinner = board.checkWinner(currentPlayer.getPieces());
            if(isWinner) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
            }
        }


    }

    private void initializeGame(int size) {
        board = new Board(size);
        Player player1 = new Player("Player 1", new PlayingPiecesX(Pieces.X));
        Player player2 = new Player("Player 2", new PlayingPiecesO(Pieces.O));

        players = new ArrayDeque<>();
        players.add(player1);
        players.add(player2);
    }
}
