import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> set = new TreeSet<>();
    for (int i = 0; i < n; ++i){
      set.add(sc.next());
    }
    for (String item : set){
      System.out.println(item);
    }
  }
}