import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int [][] array = new int[n][n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
          if (j == i + k || j == i - k ) array[i][j] = k;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}