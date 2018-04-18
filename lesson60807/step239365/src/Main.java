import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int task = sc.nextInt();
    int sum1 = 0; int sum2 = 0;
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    int id = 0; int load = 0;
    for (int i = 0; i < task; ++i){
         id = sc.nextInt();
         load = sc.nextInt();
         if (sum1 <= sum2){
           queue1.add(id);
           sum1 += load;
         }
         else {
           queue2.add(id);
           sum2 += load;
         }
    }


    for (int item : queue1){
      System.out.print(item + " ");
    }
    System.out.println();
    for (int item : queue2){
      System.out.print(item + " ");
    }
  }
}