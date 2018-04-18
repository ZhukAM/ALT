class Main {
    public static int findMin(int[] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; ++i){
            if (numbers[i] < min) min = numbers[i];
        }
        return min;
    }
}