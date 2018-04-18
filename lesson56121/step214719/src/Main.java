import java.util.ArrayList;
import java.util.List;

class Main {
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();
        List<T>  newList = new ArrayList<>();
        for (int i = 0; i < list.size(); ++i){
            if (i != 0 & i + 1 % subListSize == 0) {
                 sublists.add(newList);
                 newList = new ArrayList<>();
            }
            else {
                newList.add(list.get(i));
            }
        }

        return sublists;
    }
}