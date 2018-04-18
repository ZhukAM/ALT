import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    while (true) {
      str = sc.next();
      if (str.equals("0")) return;
      try {
        System.out.println(Integer.parseInt(str)*10);
      } catch (NumberFormatException e) {
        System.out.println("Invalid user input: " + str);
      }
    }
  }
}