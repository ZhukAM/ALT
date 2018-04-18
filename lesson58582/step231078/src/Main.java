interface LoopCallback {

    void onNewIteration(int iteration);
}

class Iteration {
    static void peformIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
        for (int i = 0; i < numberOfIterations; i++) {
            callback.onNewIteration(i);
        }
    }

    static void startIterations(int numberOfIterations) {
        peformIterationsWithCallback(numberOfIterations, new LoopCallback() {
            @Override
            public void onNewIteration(int iteration) {
                System.out.println("Iteration: " + numberOfIterations);
            }
        });
    }

    public static void main(String[] args) {

    }
}