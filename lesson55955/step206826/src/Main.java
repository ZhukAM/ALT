import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    System.out.println((n / 100) - ((n % 100 % 10 * 10) + (n % 100) / 10) + 1);
//    if (n.length() == 1 ) System.out.println(1);
//    else if (n.length() == 2 ){
//      if (n.charAt(0) == n.charAt(1)) {
//        System.out.println(1);
//        return;
//      } else {System.out.println(37); return;}
//    }
//    else if (n.length() == 3 & n.charAt(0) == n.charAt(2)) {System.out.println(1); return;}
//    else if (n.length() == 4 ) {
//      if (n.charAt(0) == n.charAt(3) & n.charAt(1) == n.charAt(2)) {
//        System.out.println(1);
//        return;
//      } else System.out.println(37);
//    }
//    else System.out.println(37);
  }
}