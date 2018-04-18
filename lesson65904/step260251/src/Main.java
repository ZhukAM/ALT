import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    for (int i = 0; i < size; ++i ){
      if (sc.nextInt() == i) {
        System.out.println("true");
        return;
      }
    }
    System.out.println("false");
  }
}