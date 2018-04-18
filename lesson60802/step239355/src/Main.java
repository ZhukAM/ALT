import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Deque<Integer> queue = new ArrayDeque<>();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0; i < n; ++i) {
        queue.addLast(sc.nextInt());
      }
      for (int i = 0; i < n; ++i) {
        System.out.println(queue.pollLast());
      }
    }
}