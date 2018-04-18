import java.time.LocalDate;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDate date1 = LocalDate.parse(sc.next());
    LocalDate date2 = LocalDate.parse(sc.next());
    LocalDate date3 = LocalDate.parse(sc.next());
    LocalDate last = date2.isAfter(date3) ? date2 : date3;
    if (date1.isEqual(last) | (date1.isAfter(date2) & date1.isAfter(date3)))
      System.out.println("true");
    else
      System.out.println("false");
  }
}