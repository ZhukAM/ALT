import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    char [][] array = new char [n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) array[i][j] = '.';
    }
    for (int j = 0; j < n; j++) {
      array[n/2][j] = '*';
    }
    for (int i = 0; i < n; i++) {
      array[i][n/2] = '*';
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) array[i][j] = '*';
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i + j == n - 1) array[i][j] = '*';
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();;
    }
  }
}