import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] array = sc.nextLine().split("\\s");
    List<String> characterList = Arrays.asList(array);
    int countSwap = sc.nextInt();
    int first; int second;
    for (int i = 0; i < countSwap; ++i){
      first = sc.nextInt();
      second = sc.nextInt();
      Collections.swap(characterList, first, second);
    }
    for (String item : characterList) {
      System.out.print(item + " ");
    }
  }
}