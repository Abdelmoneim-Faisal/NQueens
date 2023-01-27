/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueen;

/**
 *
 * @author Roshdology
 */
public class Board {
    public Board() {

}
    public int[][] setBoard(int NQueen){
        int [][] board = new int[NQueen][NQueen];
        for(int i = 0; i < NQueen; i++){
            for(int j = 0; j< NQueen; j++){
                board[i][j] = 0;
            }
        }
        return board;
    }
    
}
