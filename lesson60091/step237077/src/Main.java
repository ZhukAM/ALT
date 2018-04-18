import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.nextLine().replace(" ", "").
            equals(sc.nextLine().replace(" ", ""))) System.out.println("true");
    else System.out.println("false");
  }
}