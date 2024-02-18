package tictactoe;

public class Main {
    public static void main(String[] args) {
        
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.initializeGame();
        System.out.println("Game Winner is :"+ticTacToe.startGame());
    }
}
