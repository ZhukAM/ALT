import java.util.Iterator;

class Main {
    class Range implements Iterable<Long> {

        private long fromInclusive;
        private long toExclusive;

        public Range(long from, long to) {
            this.fromInclusive = from;
            this.toExclusive = to;
        }

        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                @Override
                public boolean hasNext() {
                    return fromInclusive < toExclusive ? true : false;
                }

                @Override
                public Long next() {
                    return fromInclusive++;
                }
            };
        }
    }

    public static void main(String[] args) {
        Range range = new Range(2, 6);
    }
}