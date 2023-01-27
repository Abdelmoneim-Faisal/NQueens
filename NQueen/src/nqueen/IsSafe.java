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
public class IsSafe {
    public static boolean isSafe(int board[][], int row, int column){
        /* Check this row on left side */
        for(int i =0; i<column;i++){
            if(board[row][i]==1)
                return false;
        }
        /* Check upper diagonal on left side */
        for(int i =row ,j =column; i>=0 && j>= 0;i--,j--){
            if(board[i][j] == 1)
                return false;
        }
        /* Check lower diagonal on left side */
        for(int i = row,j =column; i<board.length && j>= 0;i++,j--){
            if(board[i][j] == 1)
                return false;
        }
        return true;
    }
    
    
    public static boolean solveNQueen(int board[][], int column){
        if (column >= board.length){
            return true;
        }
        for(int i = 0 ; i< board.length; i++){
            if(isSafe(board,i, column)){
                board[i][column] = 1;
                if (solveNQueen(board, column+1))
                        return true;
                board[i][column] = 0;       
            }   
        }
    return false;
    }
   }


