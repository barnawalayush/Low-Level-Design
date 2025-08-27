package pattern.design.lowLevel.ticTacToe;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(3);
        System.out.println("Game started");
        game.startGame();
    }
}
