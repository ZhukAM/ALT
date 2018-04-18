import java.util.*;

class Main {
  class CurrentMax{
    int current;
    int currentMaximum;
    CurrentMax(int current, int currentMaximum){
      this.current = current;
      this.currentMaximum = currentMaximum;
    }
    public int getCurrentMaximum() {
      return currentMaximum;
    }
  }
  public static void main(String[] args) {
    Deque<CurrentMax> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; ++i) {
      String [] command = sc.nextLine().split("\\s");

      if (command.length == 2) {
        int curr = Integer.valueOf(command[1]);
        if(queue.size() == 0)
          queue.addLast(new CurrentMax(curr, curr));
        else {
          if(curr > queue.getLast().getCurrentMaximum())
            queue.addLast(new CurrentMax(curr, curr);
          else
            queue.addLast(new CurrentMax(curr, queue.getLast().getCurrentMaximum());
        }
      }

      if (command[0].equals("pop"))
                queue.poll();
      if (command[0].equals("max"))
                System.out.println(queue.getLast().getCurrentMaximum());
    }
  }
}