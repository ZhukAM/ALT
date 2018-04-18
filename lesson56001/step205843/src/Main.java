import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] array = new int[size];
    for (int i = 0; i < size; ++i) {
      if (i == size - 1) {array[0] = sc.nextInt();}
      else array[i + 1] = sc.nextInt();
    }
    for (int item : array){
      System.out.print(item + " ");
    }
  }
}