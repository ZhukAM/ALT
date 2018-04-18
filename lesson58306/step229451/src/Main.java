class MessageNotifier extends Thread {
    String msg;

    public MessageNotifier(String msg, int repeats) {
        for (int i = 0; i < repeats; i++){
            this.msg = msg;
            new Thread(this).start();

            //Thread.currentThread().setName("" + i);
            //System.out.println(currentThread().getName());
        }
    }
    @Override
    public void run() {
        System.out.println(msg);
    }
}