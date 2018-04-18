public class Main {

    public static final String DEFAULT_APPLICATION_NAME = "MyDemoApp";
    public static final int MAX_IMAGE_SIZE_KB = 4096;

    public static String hello = "Hello"; // (1)

    public static void main(String args[]) {

        System.out.println(DEFAULT_APPLICATION_NAME); // (2)

        MAX_IMAGE_SIZE_KB = 2048; // (3)

        printHello(); // (4)
    }

    private void printHello() {
        System.out.println(hello); // (5)
    }
}

//class Cat {
//    String name;
//    int age;
//    static int counter;
//    // write static and instance variables
//
//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//        counter++;
//        if (counter > 5)
//            System.out.println("You have too many cats");
//        // implement the constructor
//        // do not forgot to check the number of cats
//    }
//
//    public static int getNumberOfCats() {
//        return counter;
//        // implement the static method
//    }
//}