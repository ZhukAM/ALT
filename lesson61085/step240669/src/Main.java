//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.ListIterator;
//
//class Main {
    public static <T> List<T> createReversedListByIterator(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            iterator.next();
        }
        while (iterator.hasPrevious()){
            list.add(iterator.previous());
        }
        return list;
    }
//}