package com.jetbrains;

class TicTacToe {

    /** Initialize your data structure here. */
    char[][] board;
    int dimension;
    public TicTacToe(int n) {
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
        for(int r=0; r<n; r++) {
            for(int c=0; c<dim; c++) {
                System.out.print(board[r][c]);
            }
            System.out.println();
        }

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
                look = 'X';
                break;
            case 2:
                board[row][2*col+1] = 'O';
                look = 'O';
                break;
            default:
                look = '0';
                break;
        }
        int row_flag, col_flag;
        for(int r=0; r<dimension; r++) {
            row_flag = 0;
            for(int c=1; c<2*dimension+1; c+=2) {
                if(board[r][c]==look) {
                    row_flag += 1;
                }
            }
            if(row_flag==dimension) {
                return player;
            }
        }

        for(int c=1; c<2*dimension+1; c+=2) {
            col_flag = 0;
            for(int r=0; r<dimension; r++) {
                if(board[r][c]==look) {
                    col_flag += 1;
                }
            }
            if(col_flag==dimension) {
                return player;
            }
        }
        int diag_flag = 0;
        for(int r=0, c=1; r<dimension && c<2*dimension+1; r++, c+=2) {
            if(board[r][c]==look) {
                diag_flag += 1;
            }
            if(diag_flag==dimension) {
                return player;
            }
        }
        diag_flag = 0;
        for(int r=0, c=2*dimension-1; r<dimension && c>=0; r++, c-=2) {
            if(board[r][c]==look) {
                diag_flag += 1;
            }
            if(diag_flag==dimension) {
                return player;
            }
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