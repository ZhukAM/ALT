import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    List yourList = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
    System.out.println(yourList);
  }
}