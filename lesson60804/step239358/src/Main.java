import java.util.*;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    List<Character> arrayChar = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
    List<Character> lc = new ArrayList<>();
    for (int i = 0; i < arrayChar.size(); i++){
      char c = arrayChar.get(i);
      if (c == '(' || c == '[' || c == '{') {
        lc.add(c);
      } else if (c == ')' || c == ']' || c == '}') {
        if (lc.isEmpty()) {
          lc.add(c);
          break;
        } else if ((lc.get(lc.size() - 1) == '(' && c == ')') || (lc.get(lc.size() - 1) == '[' && c == ']') ||
                (lc.get(lc.size() - 1) == '{' && c == '}')){
          lc.remove(lc.size()-1);
        } else {
          break;
        }
      } else continue;
    }

    if (lc.isEmpty()) System.out.println("true");
    else System.out.println("false");
  }
}