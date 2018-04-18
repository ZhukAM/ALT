public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableWorker());
        t1.setName("worker-1");
        t1.start();
        Thread t2 = new Thread(new RunnableWorker());
        t2.setName("worker-2");
        t2.start();
        Thread t3 = new Thread(new RunnableWorker());
        t3.setName("worker-3");
        t3.start();

    }
}

class RunnableWorker implements Runnable {

    @Override
    public void run() {
        // the method does something
    }
}