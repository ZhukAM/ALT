import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; ++i) {
      array[i] = sc.nextInt();
    }
    int first = sc.nextInt();
    int second = sc.nextInt();
    for (int i = 1; i < size - 1; ++i){
      if (array[i] == first && array[i+1] == second || array[i] == first && array[i-1] == second) {
        System.out.println("true");
        return;
      }
      if (array[i] == second && array[i+1] == first || array[i] == second && array[i-1] == first) {
        System.out.println("true");
        return;
      }
    }
    System.out.println("false");
  }
}