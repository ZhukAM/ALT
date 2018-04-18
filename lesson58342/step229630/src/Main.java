class Main {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();
        Thread.sleep(2000L);
        try {
          worker.interrupt();
        } catch (Exception e) {
            System.out.println("wtf");
        }
    }
}

class Worker extends Thread{
    @Override
    public void run() {
        //todo
    }
}