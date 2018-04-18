import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dateTime = sc.nextLine();
    int hours = sc.nextInt(); int minutes = sc.nextInt();
    //String dateTime = "2017-12-15T11:11";
    LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
    System.out.println(localDateTime.minusHours(hours).plusMinutes(minutes).toString());
  }
}