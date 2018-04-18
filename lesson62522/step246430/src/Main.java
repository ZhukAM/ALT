import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int date = sc.nextInt();
    LocalDateTime[] timeStore = new LocalDateTime[date];
    LocalDateTime latestDate = LocalDateTime.of(0, 1, 1, 0, 0);
    for (int i = 0; i < date; ++i) {
      timeStore[i] = LocalDateTime.parse(sc.next());
      if (timeStore[i].isAfter(latestDate)) {
        latestDate = timeStore[i];
      }
    }
    System.out.println(latestDate.toString());
  }
}