import java.util.Scanner;

class Main {
  public static void decomp(int n) {
    if (n == 1) System.out.print(1 + " ");
    else {
      System.out.println(n);
      decomp(n-1);
    }
  }
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    decomp(n);
  }
}