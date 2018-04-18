import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = new Scanner(System.in).nextInt();
    if ((x % 4 == 0 & x % 100 != 0) | (x % 400 == 0)) {
      System.out.println("Leap");
    }
    else {
      System.out.println("Regular");
    }
  }
}