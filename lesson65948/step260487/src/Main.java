import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; ++i){ array[i] = sc.nextInt(); }
    if(array.length == 0) {
      System.out.println("-1");
      return;
    }
    int target = sc.nextInt();
    //int jump = (int)Math.sqrt(n);

    int currentRight = 0; // right border of the current block
    int prevRight = 0; // right border of the previous block

    /* If array is empty, the element is not found */
    if (array.length == 0) {
      System.out.printf("-1");
      return;
    }

    /* Check the first element */
    if (array[currentRight] == target) {
      return 0;
    }

    /* Calculating the jump length over array elements */
    int jumpLength = (int) Math.sqrt(array.length);

    /* Finding a block where the element may be present */
    while (currentRight < array.length - 1) {

      /* Calculating the right border of the following block */
      currentRight = Math.min(array.length - 1, currentRight + jumpLength);

      if (array[currentRight] >= target) {
        break; // Found a block that may contain the target element
      }

      prevRight = currentRight; // update the previous right block border
    }

    /* If the last block is reached and it cannot contain the target value => not found */
    if ((currentRight == array.length - 1) && target > array[currentRight]) {
      System.out.printf("-1");
      return ;
    }


//
//    int left = 0; int right = 0;
//    while (right <= n - 1){
//      right += jump;
//      if(right >= n - 1)
//        right = n - 1;
//      if (left == n - 1 & array[left] > find){
//        System.out.println(left + " " + right);
//        return;
//      }
//      if(array[right - 1] >= find) {
//        int rightPrev = right - 1;
//        System.out.println(left + " " + rightPrev);
//        return;
//      }
//      else {
//        left = right;
//
//      }
//    }
//    System.out.println("-1");
  }
}