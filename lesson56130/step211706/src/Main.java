import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = new TreeSet<>();
        String[] s1 = sets[0].split("\\s");
        for (int i = 0; i < sets[0].length(); ++i){
            set1.add(Integer.parseInt(s1[i]));
        }

        Set<Integer> set2 = new TreeSet<>();
        String[] s2 = sets[1].split("\\s");
        for (int i = 0; i < sets[1].length(); ++i){
            set2.add(Integer.parseInt(s2[i]));
        }

        Set<Integer> set3 = new TreeSet<>();//TreeSet<>();
        String[] s3 = sets[2].split("\\s");
        for (int i = 0; i < sets[2].length(); ++i){
            set3.add(Integer.parseInt(s3[i]));
        }


        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);

        for (int item : resultTreeSet){
            System.out.println(item);
        }
    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(new TreeSet<>(set1).last());
        resultSet.add(new TreeSet<>(set2).last());
        resultSet.add(new TreeSet<>(set3).last());
        return new TreeSet<>(resultSet.descendingSet());
    }
}