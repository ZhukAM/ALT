import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] array = sc.nextLine().split("\\s");
    List<String> characterList = Arrays.asList(array);
    System.out.println(Collections.frequency(characterList, sc.next()));
  }
}