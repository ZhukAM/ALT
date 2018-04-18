import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dateTime1 = sc.nextLine();
    String dateTime2 = sc.nextLine();
    LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1);
    LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2);
    int day = localDateTime1.getDayOfYear() - localDateTime2.getDayOfYear();
    int hour = localDateTime1.getHour() - localDateTime2.getHour();
    int minutes = localDateTime1.getMinute() - localDateTime2.getMinute();
    System.out.println(Math.abs(day*24*60 + hour*60 + minutes)/60);

  }
}