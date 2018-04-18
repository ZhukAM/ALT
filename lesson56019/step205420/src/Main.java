import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n, m, x, y, max;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt(); m = sc.nextInt();
    int [][] array = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {array[i][j] = sc.nextInt();}
    }
    max = array[0][0];
    x = 0; y = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
          x = i; y = j;
        }
      }
    }
    System.out.println(x + " " + y) ;
  }
}