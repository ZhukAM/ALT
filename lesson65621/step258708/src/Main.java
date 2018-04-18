//class Linear {
    public static boolean contains(int[] numbers, int number) {
        boolean res = false;
        for (int i = 0; i < numbers.length; ++i){
            if (numbers[i] == number) return true;
        }
        return res;
    }
//}