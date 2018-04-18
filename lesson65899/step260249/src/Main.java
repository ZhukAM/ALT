import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int eachFrom = 0;
    int[] array = new int[n];
    for (int i = 0; i < n; ++i) {
      array[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    int[] arrayResult = new int[k];
    for (int i = 0; i < k; ++i) {
      int pos = Arrays.binarySearch(array, sc.nextInt()) + 1;
      arrayResult[i] = pos >= 1 & pos <= array.length ? pos : -1;
    }
    for (int i = 0; i < k; ++i) {
      System.out.print(arrayResult[i] + " ");
    }
  }
}