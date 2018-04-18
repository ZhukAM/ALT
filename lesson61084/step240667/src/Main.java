import java.util.Iterator;

class Main{
    public static int findMaxByIterator(Iterator<Integer> iterator) {
    int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current > max) {
                max = current;
            }
        }
    return max;
   }
}