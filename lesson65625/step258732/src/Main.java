//class Linear {
    public static int[] searchIndexes(int[] first, int[] second) {
        int[] array = new int[first.length];
        for (int i = 0; i < first.length; ++i){
        array[i] = -1;
            for (int j = 0; j < second.length; j++){
                if (second[j] == first[i]) { array[i] = j; break; }
            }
        }
        return array;
    }
//}