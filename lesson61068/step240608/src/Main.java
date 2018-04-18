import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] str1 = sc.nextLine().split("\\s");
    List<String> list = Arrays.asList(str1);
    String [] str2 = sc.nextLine().split("\\s");
    List<String> subList = Arrays.asList(str2);
    int first = Collections.indexOfSubList(list, subList);
    int last = Collections.lastIndexOfSubList(list, subList);
    System.out.println(first + " " + last);
  }
}