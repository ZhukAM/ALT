import java.util.List;

class Main {
    static List<String> changeList(List<String> list) {
        String max = "";
        for (String item : list){
            if (item.length() > max.length()) max = item;
        }
        final String MAX = max;
        list.replaceAll(x -> MAX);
        return list;
    }
}