import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n, m;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();  m = sc.nextInt();
    int [][] array = new int [n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    for (int j = 0; j < m; j++) {
      for (int i = n - 1; i >= 0; i--){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}