import java.util.Scanner;

class Main {
    public static void main(String args[]) throws InterruptedException {

        final Scanner scanner = new Scanner(System.in); // scanner for reading range borders

        final int from1Incl = scanner.nextInt(); // left border of the first range
        final int to1Incl = scanner.nextInt();   // right border of the first range

        final int from2Incl = scanner.nextInt(); // left border of the second range
        final int to2Incl = scanner.nextInt();   // right border of the second range

        RangeSummator summator1 = new RangeSummator(from1Incl, to1Incl); // first summator
        summator1.start();
        summator1.join();
        RangeSummator summator2 = new RangeSummator(from2Incl, to2Incl); // second summator
        summator2.start();
        summator2.join();
        long partialSum1 = summator1.getResult();
        long partialSum2 = summator2.getResult();

        long sum = partialSum1 + partialSum2; // the sum is 0, fix it!
        System.out.println(sum);
    }
}
class RangeSummator extends Thread {
    int from;
    int to;
    RangeSummator(int from, int to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void run() {
        // wtf
    }

    int getResult(){
        return 0;
    }
}
