class Main {
    public static void invokeMethods(Thread t1, Thread t2, Thread t3) throws InterruptedException {
      t3.start();
      try {
          t3.join();
      } catch (InterruptedException e){
          System.out.println("fuck");
      }
      t2.start();
        try {
            t2.join();
        } catch (InterruptedException e){
            System.out.println("fuck");
        }
      t1.start();
        try {
            t1.join();
        } catch (InterruptedException e){
            System.out.println("fuck");
        }
    }
}