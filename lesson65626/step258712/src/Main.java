//class Linear {
    public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
        int index = -1;
        for (int i = startIndex; i < endIndex; ++i){
            if (numbers[i] == value) return i;
        }
        return index;
    }
//}