import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            if(next.equals("Hip")) {
                System.out.println(next);
                System.out.println("Hop");
            }
            else {
                System.out.println(next);
            }
        }
   }
}
