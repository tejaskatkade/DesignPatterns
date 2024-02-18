package tictactoe;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPice(int row , int column, PlayingPiece playingPiece){
        if(board[row][column] != null){ 
            return false;
        }
        board[row][column] = playingPiece;
        return true;

    }

    public List<Map.Entry<Integer,Integer>> getFreeCells(){
        //int row , col;
        List<Map.Entry<Integer,Integer>> rowCol = new ArrayList<>();
        for(int i=0; i< size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == null){
                    Map.Entry<Integer,Integer> cell = new AbstractMap.SimpleEntry<>(i,j);
                    rowCol.add(cell);
                }
            }
        }
        return rowCol;
    }

    public void printBoard(){
        System.out.println("+-----------+");
        for(int i=0; i<size; i++){
            System.out.print("|");
            for(int j=0; j<size; j++ ){
                if(board[i][j] != null){
                    System.out.print(board[i][j].piece.name()+"  ");
                }else{
                    System.out.print("   ");
                }
                
                System.out.print("|");
            }
            System.out.println();
            System.out.println("+-----------+");
        }
    }

    

    
}
