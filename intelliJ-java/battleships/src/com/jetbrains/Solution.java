package com.jetbrains;

class Solution {
    public int countBattleships(char[][] board) {
        int ships = 0;
        int nRows = board.length;
        int nCols = board[0].length;

        boolean rowsX[] = new boolean[nRows];
        boolean colsX[] = new boolean[nCols];

        int col_flag = 0;
        for(int i=0; i<nRows; i++) {
            rowsX[i] = false;
            for(int j=0; j<nCols; j++) {
                if(board[i][j]=='X') {
                    if(rowsX[i] == false && colsX[j] == false) {
                        ships++;
                        rowsX[i] = true;
                        colsX[j] = true;
                    }

                }
                else {
                    rowsX[i] = false;
                    colsX[j] = false;
                }

            }

        }
        return ships;
    }
}