import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.nextLine().substring(sc.nextInt(), sc.nextInt() + 1));
  }
}