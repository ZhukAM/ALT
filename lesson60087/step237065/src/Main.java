import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String str = new Scanner(System.in).next();
    if (str.toUpperCase().startsWith("J")) System.out.println("true");
    else System.out.println("false");
  }
}