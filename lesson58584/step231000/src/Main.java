interface Callback {

    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}
class Anonym {
    public static void startLongProcess(Callback callback){}

    public static void main(String[] args) {
        startLongProcess(new Callback() {
            @Override
            public void onStarted() {
                System.out.println("The process started");
            }

            @Override
            public void onStopped(String cause) {
                System.out.println(cause);
            }

            @Override
            public void onFinished(int code) {
                if (code == 0)
                    System.out.println("The process successfully finished");
                else
                    System.out.println("The process is finished with error: " + code);
            }
        });
    }
}