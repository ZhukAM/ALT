import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true){
            String str = scanner.next();
            for (int i = 0; i < str.length(); i++) {
                if (java.lang.Character.isLowerCase(str.charAt(i))){
                    System.out.println(str.toUpperCase());
                    break;
                }
                if (i == str.length() - 1 & java.lang.Character.isUpperCase(str.charAt(i))){
                    System.out.println("FINISHED");
                    return;
                }
            }
        }
    }
}