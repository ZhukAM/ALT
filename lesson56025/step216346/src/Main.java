import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m, k, count = 0;
    n = sc.nextInt(); m = sc.nextInt();
    int a[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++){
        a[i][j] = sc.nextInt();
      }
    }
    k = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[i][j] == 0) {
          count += 1;
          if (count == k) {
            System.out.println(i + 1);
            return ;
          }
        }
        else count = 0;
      }
      count = 0;
    }
    System.out.println(0);
  }
}