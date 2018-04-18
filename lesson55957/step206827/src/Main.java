import java.util.Scanner;
import static java.lang.Math.abs;

class Main {
  public static void main(String[] args) {
    int m, n, k, l;
    Scanner sc = new Scanner(System.in);
    m = sc.nextInt(); n = sc.nextInt(); k = sc.nextInt(); l = sc.nextInt();
    if ((abs(m - k) == abs(n - l)) | (m == k | n == l)) {
      System.out.println("YES");
    }
   else
      System.out.println("NO");
  }
}