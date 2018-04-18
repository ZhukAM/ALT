//class Main {
    public static int findIndexOfKMin(int[] numbers, int k) {
        int indexK = -1;
        if (numbers.length == 0) return indexK;
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == min){
                count++;
                if (count == k) {
                    indexK = i;
                    break;
                }
            }
        }

        return indexK;
}
//}