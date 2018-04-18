
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
        for (int i = list.size() - 1; i >= 0; --i) {
            int item = Integer.valueOf((String) list.get(i));
            if (i%2 != 0) System.out.print(item + " ");
        }
    }
}