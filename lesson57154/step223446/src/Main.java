import java.util.List;
import java.util.stream.Collectors;

class Omitting {
    public static List<String> omitLongStrings(List<String> strings) {
        return strings.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
    }
}