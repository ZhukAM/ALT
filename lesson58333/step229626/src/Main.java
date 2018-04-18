import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();

        final SlowStringProcessor processor = new SlowStringProcessor(str);
        processor.start();
        processor.join();
        System.out.println(processor.getNumberOfUniqueCharacters());
    }
}

class SlowStringProcessor extends Thread {
    String str;
    SlowStringProcessor(String str){
        this.str = str;
    }
    int getNumberOfUniqueCharacters(){
        return 0;
    }

    @Override
    public void run() {
        // wtf
    }
}