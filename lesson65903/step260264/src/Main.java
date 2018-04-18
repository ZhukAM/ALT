//class Main {
    public static int binarySearch(int elem, int[] array) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (elem == array[mid]) {
                if (elem != array[mid - 1]) return mid;
                else right = mid - 1;
            } else if (elem < array[mid]) {
                right = mid + 1;
            } else {
                left = mid - 1;
            }
        }
        return -1;
    }
//}