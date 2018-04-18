import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] matrix = new int[rows][cols];
    int[][] matrixT = new int[cols][rows];
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j <cols; ++j){
        matrix[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j <cols; ++j) {
        matrixT[j][i] = matrix[i][j];
      }
    }
    for (int i = 0; i < cols; ++i) {
      for (int j = 0; j < rows; ++j) {
        System.out.print(matrixT[i][j] + " ");
      }
    }
  }
}