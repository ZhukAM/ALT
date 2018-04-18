import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int current = 0;
    int n = sc.nextInt();
    for (int i = 0; i < n; i++){
      current = sc.nextInt();
      if (current%2 == 0) deque.addFirst(current);
      else deque.addLast(current);
    }
    for (int elem : deque){
      System.out.println(elem);
    }
  }
}