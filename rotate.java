import java.util.*;

class rotate {
  // public static char[][][] rotate(char[][][] matrix) {
  //   int rows = matrix.length;
  //   int cols = matrix[0].length;
  //   /*
  //   a b c
  //   d e f
  //   g h i
  //   
  //   g d a
  //   h e b
  //   i f c
  //   */
  //   char[][][] res = new char[rows][cols][2];
  //   int rev_rows = rows-1;
  //   int rev_cols = cols-1;
  //   
  //   for (int i=0; i<rows; i++) {
  //     for (int j=0; j<cols; j++) {
  //         res[i][j] = matrix[rev_rows][i];
  //         rev_rows-=1;
  //         // System.out.print(matrix[z][j]);
  //     }
  //     rev_rows = rows-1;
  //   }
  //   // System.out.println(res);
  //   return res;
  // }
  public static void rotate(char[][][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    /*
    a b c
    d e f
    g h i
    
    g d a
    h e b
    i f c
    */
    char[][][] res = new char[rows][cols][2];
    // System.arraycopy(matrix, 0, res, 0, rows);
    int rev_rows = rows-1;
    int rev_cols = cols-1;
    
    for(int i=0; i<rows; i++) {
      for(int j=0; j<cols; j++) {
        res[i][j] = matrix[i][j].clone();
      }
    }
    
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
          matrix[i][j] = res[rev_rows][i];
          rev_rows-=1;
      }
      rev_rows = rows-1;
    }    
  }
  public static void main(String[] args) {
    char[][][] matrix = new char[3][3][2];
    matrix[0][0] = new char[]{'a', 'a'};
    matrix[0][1] = new char[]{'b', 'b'};
    matrix[0][2] = new char[]{'c', 'c'};
    
    matrix[1][0] = new char[]{'d', 'd'};
    matrix[1][1] = new char[]{'e', 'e'};
    matrix[1][2] = new char[]{'f', 'f'};
    
    matrix[2][0] = new char[]{'g', 'g'};
    matrix[2][1] = new char[]{'h', 'h'};
    matrix[2][2] = new char[]{'i', 'i'};

    // for(char[][] row: matrix) {
    //   for(char[] c: row) {
    //     System.out.print(c);
    //     System.out.print(' ');
    //   }
    //   System.out.println();
    // }
    
    rotate(matrix);
    for(char[][] row: matrix) {
      for(char[] c: row) {
        System.out.print(c);
        System.out.print(' ');
      }
      System.out.println();
    }
    
  }
  
}