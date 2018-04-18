import java.time.LocalDate;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDate date1 = LocalDate.parse(sc.next());
    LocalDate date2 = LocalDate.parse(sc.next());
    LocalDate date3 = LocalDate.parse(sc.next());
    if (!date1.isEqual(date2) & !date1.isEqual(date3) & (date1.isAfter(date2) & date1.isBefore(date3) |
            (date1.isAfter(date3) & date1.isBefore(date2))))
      System.out.println("true");
    else
      System.out.println("false");
  }
}