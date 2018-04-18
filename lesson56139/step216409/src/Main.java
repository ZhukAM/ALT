import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strExample = sc.next();
    String codeExample = sc.next();
    Map<Character, Character> mapEncode = new HashMap<>();
    Map<Character, Character> mapDecode = new HashMap<>();
    for (int i = 0; i < strExample.length(); ++i){
      mapEncode.put(strExample.charAt(i), codeExample.charAt(i));
      mapDecode.put(codeExample.charAt(i), strExample.charAt(i));
    }
    String strForEncode = sc.next();
    String strForDecode = sc.next();
    String resEncode = "";
    String resDecode = "";
    for (int i = 0; i < strForEncode.length(); i++){
      resEncode += mapEncode.get(strForEncode.charAt(i));
    }
    for (int i = 0; i < strForDecode.length(); i++){
      resDecode += mapDecode.get(strForDecode.charAt(i));
    }
    System.out.println(resEncode.toString());
    System.out.println(resDecode.toString());
  }
}