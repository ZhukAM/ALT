import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int prev = sc.nextInt();
        boolean flag1 = false;
        boolean flag2 = false;
        while (sc.hasNext()) {
            int curr = sc.nextInt();
            if (curr == 0)
                break;
            if (curr > prev){
                prev = curr;
                flag1 = true;
                if (flag2 == true){System.out.println("false"); return;}
            }
            else if (curr < prev) {
                prev = curr;
                flag2 = true;
                if (flag1 == true){System.out.println("false"); return;}
            }
            else
                continue;
        }
        System.out.println("true");
  }
}