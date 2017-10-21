package com.jetbrains;

class TicTacToeFast {

    /** Initialize your data structure here. */
    char[][] board;
    int dimension;
    int[] row_arr, col_arr;
    int diag_arr = 0;
    int anti_diag_arr = 0;
    public TicTacToeFast(int n) {
        dimension = n;
        int dim = 2*n+1;
        board = new char[n][dim];
        for(int r=0; r<n; r++) {
            for(int c=0; c<dim; c+=2) {
                board[r][c] = '|';
            }
            for(int c=1; c<dim; c+=2) {
                board[r][c] = ' ';
            }

        }
        row_arr = new int[n];
        col_arr = new int[n];


    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        char look;
        switch (player) {
            case 1:
                board[row][2*col+1] = 'X';
                row_arr[row]++;
                col_arr[col]++;
                if(row==col) {
                    diag_arr++;
                }
                if(row + col == dimension-1) {
                    anti_diag_arr++;
                }
                look = 'X';
                break;
            case 2:
                board[row][2*col+1] = 'O';
                row_arr[row]--;
                col_arr[col]--;
                if(row==col) {
                    diag_arr--;
                }
                if(row + col == dimension-1) {
                    anti_diag_arr--;
                }
                look = 'O';
                break;
            default:
                look = '0';
                break;
        }


        if(row_arr[row]==dimension || row_arr[row]==-dimension) {
            return player;
        }
        if(col_arr[col]==dimension || col_arr[col]==-dimension) {
            return player;
        }
        if(diag_arr==dimension || diag_arr==-dimension) {
            return player;
        }
        if(anti_diag_arr==dimension || anti_diag_arr==-dimension) {
            return player;
        }

        return 0;
    }

}

// TicTacToe tester = new TicTacToe(3);

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
