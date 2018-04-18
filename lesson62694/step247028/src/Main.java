import java.time.LocalTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalTime startFirst = LocalTime.parse(sc.next());
    LocalTime finishFirst = LocalTime.parse(sc.next());
    LocalTime startSecond = LocalTime.parse(sc.next());
    LocalTime finishSecond = LocalTime.parse(sc.next());
    if (startFirst.isAfter(finishSecond) | startSecond.isAfter(finishFirst))
      System.out.println("false");
    else
      System.out.println("true");
  }
}