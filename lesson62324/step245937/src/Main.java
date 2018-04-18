import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.parse(new Scanner(System.in).next());
    System.out.println((localDateTime.getDayOfYear() - 1)*24 + localDateTime.getHour());
  }
}