class Main {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int x, int y, int z);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (int x, int y, int z) ->
            x != y & x != z & z != y;

}