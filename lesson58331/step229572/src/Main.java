//class Main{
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        for (Thread thread : threads){
            if(thread.getState().equals(Thread.State.NEW)){
                try {
                    thread.start();
                    thread.join();
                } catch (InterruptedException e){
                    System.out.println("wtf?");
                } finally {
                    break;
                }
            }
        }
    }
//}