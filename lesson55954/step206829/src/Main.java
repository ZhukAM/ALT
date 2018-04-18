import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = new Scanner(System.in).nextInt();
    if (x > -15 & x <= 12) System.out.println("True");
    else if (x > 14 & x < 17) System.out.println("True");
    else if (x >= 19) System.out.println("True");
    else System.out.println("False");
  }
}