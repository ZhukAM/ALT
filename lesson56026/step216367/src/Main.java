import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      int n, i = 0, j = -1;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int [][] a = new int[n][n];
      for (int k = 0; k < n; k++) {
        for (int l = 0; l < n; l++){
          a[k][l] = 0;
        }
      }

      int count = 0;
      while (count < n*n) {
        while (j < n - 1 && a[i][j + 1] != 0)
          a[i][++j] = ++count;    // right
        while (i < n - 1 && a[i + 1][j] != 0)
          a[++i][j] = ++count;    // down
        while (j > 0 && a[i][j - 1] != 0)
          a[i][--j] = ++count;    // left
        while (i > 0 && a[i - 1][j] != 0)
          a[--i][j] = ++count;    // up
      }

      for (int k = 0; k < n; k++) {
        for (int l = 0; l < n; l++){
          System.out.println(a[k][l]);
        }
        System.out.println();
      }
    }

}