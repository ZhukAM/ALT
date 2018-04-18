import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numbersWords = sc.nextInt();
    Map<String, String> speller = new HashMap<>();
    for (int i = 0; i < numbersWords; i++){
      String word = sc.next();
      speller.put(word.toUpperCase(), word);
    }
    int numbersLines = sc.nextInt();
    Map<String, String> result = new TreeMap<>();
    String [] next = null;
    for (int i = 0; i < numbersLines; ++i){
      next = sc.nextLine().split("\\s");
      for (int j = 0; j < next.length; ++j){
        String nextWord = next[j];
        if (!speller.containsKey(nextWord.toUpperCase())){
          result.putIfAbsent(nextWord, nextWord);
        }
      }
    }
    for (String item : result.keySet()){
      System.out.println(item);
    }
  }
}