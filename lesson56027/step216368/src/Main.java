import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String[]> matrix = new ArrayList<>();
    String str = "";
    while (sc.hasNext()){
      str = sc.nextLine();
      if (!str.equals("end"))
        matrix.add(str.split("\\s"));
      else break;
    }
    int n = matrix.size(); int m = matrix.get(0).length;
    int[][] matrixRes = new int[n][m];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        int iPrev = i - 1 >= 0 ? i - 1 : n - 1;
        int iNext = i + 1 <= n - 1 ? i + 1 : 0;
        int jPrev = j - 1 >= 0 ? j - 1 : m - 1;
        int jNext = j + 1 <= m - 1 ? j + 1 : 0;
         matrixRes[i][j] = Integer.parseInt(matrix.get(iPrev)[j]) +
                           Integer.parseInt(matrix.get(iNext)[j]) +
                           Integer.parseInt(matrix.get(i)[jPrev]) +
                           Integer.parseInt(matrix.get(i)[jNext]);
      }
    }
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        System.out.print(matrixRes[i][j] + " ");
      }
      System.out.println();
    }
  }
}