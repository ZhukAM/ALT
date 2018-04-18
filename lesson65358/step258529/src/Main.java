//class Main {
    public static int findSecondLargestNumber(int[] numbers) {
        if (numbers.length == 0 | numbers.length == 1) {
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        int formerMax = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; ++i){
            if(numbers[i] > max) {
                formerMax = max;
                max = numbers[i];
            }
            else {
                if(numbers[i] > formerMax & numbers[i] < max){
                    formerMax = numbers[i];
                }
            }
        }
        return formerMax;
    }
//}