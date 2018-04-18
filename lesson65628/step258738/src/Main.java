class Search{

    public static int[] countOccurrences(int[] first, int[] second) {
        int[] array = new int[first.length];
        int count = 0;
        for (int i = 0; i < first.length; ++i){
            for (int j = 0; j < second.length; j++){
                if (second[j] == first[i]) count++;
            }
            array[i] = count;
            count = 0;
        }
        return array;
    }
}