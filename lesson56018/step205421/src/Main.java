import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int [][] array = new int [n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {array[i][j] = sc.nextInt();}
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        if (array [i][j] != array[j][i]) {
          System.out.println("NO");
          return ;
        }
    }
    System.out.println("YES");
  }
}