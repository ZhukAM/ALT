import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDateTime range1 = LocalDateTime.parse(sc.next());
    LocalDateTime range2 = LocalDateTime.parse(sc.next());
    LocalDateTime start = range1.isBefore(range2) ? range1 : range2;
    LocalDateTime finish = range1.isAfter(range2) ? range1 : range2;
    int numDate = sc.nextInt();
    int count = 0;
    for (int i = 0; i < numDate; ++i) {
      LocalDateTime current = LocalDateTime.parse(sc.next());
      if ((current.isAfter(start) | current.isEqual(start)) & current.isBefore(finish)) count++;
    }
    System.out.println(count);
  }
}