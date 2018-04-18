import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Sorting {
    public static void sortInDescendingOrder(List<Integer> sequence) {
        Collections.sort(sequence);
        Collections.reverse(sequence);
        for (int item : sequence){
            System.out.print(item + " ");
        }
    }
}