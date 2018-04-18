//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.stream.Collectors;
//
//class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        ListIterator<String> listIterator = list.listIterator(list.size());
        List<String> listString = new ArrayList<>();
        while (listIterator.hasPrevious()) {
            String current = listIterator.previous();
            if(!current.startsWith("J")){
                continue;
            }
            else {
                System.out.println(current.substring(1));
            }
        }
    }
//}