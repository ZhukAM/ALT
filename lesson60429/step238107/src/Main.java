import java.util.stream.Stream;
class Find{
    public static int getNumberOfMaxParam(int a, int b, int c) {
        return Stream.of(a, b, c).max((x, y) -> x.compareTo(y)).get();
    }

}