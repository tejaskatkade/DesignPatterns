package tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){

        players = new LinkedList<>();

        PlayingPiece playingPieceO = new PlayingPieceO();
        Player player1 = new Player(" Player 1 ", playingPieceO);
        
        PlayingPiece playingPiecex = new PlayingPieceX();
        Player player2 = new Player(" Player 2 ", playingPiecex);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

    }
    public String startGame(){
        boolean noWinner = true;

        while(noWinner){
            //Take First Player 

            Player turn = players.poll();

            gameBoard.printBoard();
            boolean val = gameBoard.getFreeCells().isEmpty();
            int size = gameBoard.getFreeCells().size();
            System.out.println("total free cells "+size);
            if(val){
                noWinner = false;
                continue;
            }

            // read the user input

            System.out.println("Player : "+ turn.name + " Enter row,column ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int column = Integer.valueOf(values[1]);

            // adding piece

            boolean addingPiece = gameBoard.addPice(row, column, turn.playingPiece);
            if(!addingPiece){
                System.out.println("Incorrect Position to add Piece");
                players.addFirst(turn);
                continue;
            }
            players.addLast(turn);

            boolean winner = isThereWinner(row, column, turn.playingPiece.piece);
            if(winner){
                gameBoard.printBoard();
                return turn.name;
            }
        }
        return "tie";
    }
    public boolean isThereWinner(int row, int col, Piece piece){
        boolean rowMath = true;
        boolean colMath = true;
        boolean diagonalMath = true;
        boolean antiDiagonalMath = true;

        //row
        for(int i=0; i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].piece != piece ){
                rowMath = false;
            }
        }
        //column
        for(int i=0; i<gameBoard.size; i++){
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].piece != piece ){
                colMath = false;
            }
        }
        //diagonal
        for(int i=0,j=0; i<gameBoard.size; i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].piece != piece ){
                diagonalMath = false;
            }
        }
        //row
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size; i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].piece != piece ){
                antiDiagonalMath = false;
            }
        }

        return rowMath || colMath || diagonalMath || antiDiagonalMath ;
    }


  
    
}
