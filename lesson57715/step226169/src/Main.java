
    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count1 = 0; int count2 = 0;
        for (Integer e1 : list1) {
            if (e1 == elem) count1++;
        }
        for (Integer e2 : list2) {
            if (e2 == elem) count2++;
        }
        return count1 == count2 ? true : false;
    }
