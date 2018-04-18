import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDate localDate = LocalDate.parse(sc.next());
    int days = sc.nextInt();
    LocalDate newYear = LocalDate.of(localDate.getYear() + 1, 1, 1);
    if (localDate.plusDays(days).isEqual(newYear) | localDate.plusDays(days).isAfter(newYear) ) {
      System.out.println("true");
    }
    else System.out.println("false");
  }
}