import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numStore = sc.nextInt();
    String[] store = new String[numStore];
    LocalTime[] timeStore = new LocalTime[numStore];
    LocalTime time = LocalTime.of(20, 0);
    for (int i = 0; i < numStore; ++i) {
      store[i] = sc.next();
      timeStore[i] = LocalTime.parse(sc.next());
      if (timeStore[i].isAfter(time)) {
        System.out.println(store[i]);
      }
    }
  }
}