import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); int m = sc.nextInt();
    int[][] array = new int[n][m];
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    List<int[]> list = Arrays.asList(array);
    int rotate = sc.nextInt();
    Collections.rotate(list, rotate);
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}