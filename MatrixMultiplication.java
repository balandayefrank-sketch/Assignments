public class MatrixMultiplication {
    public static void main(String[] args) {
      int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };
      int[][] results = new int[2][2];



      int row = 0;
      for (int[] currentRow : matrixA) {
        int col =0;

        for (int currentCol : matrixB[0]) {
          int sum = 0;
          int k = 0;
          
          for (int value :  currentRow) {
               sum += value * matrixB[k][col];
               k++;
          }
          
          results[row][col] = sum;
          col++;
      
        }
        row++;
      }

System.out.println("Result Matrix:") ;

        for (int[] resultRow : results) {
            for (int number : resultRow) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
