public class MyClass implements Runnable {
    private int a;
    private int b;
    private int numberOfThreads;

    public MyClass(int a, int b, int numberOfThreads) {
        this.a = a;
        this.b = b;
        this.numberOfThreads = numberOfThreads;
    }

    public void run() {
        for (int i = a; i <= b; i += numberOfThreads) {

            if (Operations.isPrimeNumber(i)) {
                System.out.println(i);

            }
        }

    }
}
