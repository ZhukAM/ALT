import java.util.Objects;
class Pair<T, U> {
    T first;
    U second;

    private Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    static <T, U> Pair of(T first, U second){
        return new Pair(first, second);
    }
    T getFirst(){return this.first;}

    U getSecond(){return this.second;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) &&
                Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirst(), getSecond());
    }

}