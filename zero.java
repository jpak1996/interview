class zero {
  public static void zero(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
        
    boolean[] zero_rows = new boolean[rows];
    boolean[] zero_cols = new boolean[cols];
    
    
    for(int i=0; i<rows; i++) {
      zero_rows[i] = false;
    }
    
    for(int i=0; i<cols; i++) {
      zero_cols[i] = false;
    }
    /*
    0 1
    1 1
    1 1
    */
    
    for(int i=0; i<rows; i++) {
      for(int j=0; j<matrix[i].length; j++) {
        
        if(matrix[i][j]==0) {
          zero_rows[i] = true;
          zero_cols[j] = true;
        }
        
      }
    }
    
    for(int i=0; i<rows; i++) {
      for(int j=0; j<matrix[i].length; j++) {
        if(zero_rows[i] || zero_cols[j]) {
          matrix[i][j] = 0;
        }
      }
    }
    
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    zero(matrix);
    for(int[] row : matrix) {
      for(int a : row) {
        System.out.print(a);
      }
      System.out.println();
    }
  }
}