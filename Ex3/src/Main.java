import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int numberOfThreads;

    public static void main(String[] args) {

        System.out.println(" a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(" b = ");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        System.out.println(" Nr of threads = ");
        Scanner scanner3 = new Scanner(System.in);
        int nrOfTh = scanner3.nextInt();

        numberOfThreads = nrOfTh;
        if (a % 2 == 0)
            a++;
        List<Thread> list = new ArrayList<>();
        long ts = System.currentTimeMillis();
        for (int i = 0; i < numberOfThreads; i++) {
            Thread t = new Thread(new MyClass(a + 2 * i, b, 2 * numberOfThreads));
            list.add(t);
        }
        for (int i = 0; i < numberOfThreads; i++) {
            list.get(i).start();
        }
        try {
            for (int i = 0; i < numberOfThreads; i++) {
                list.get(i).join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long tf = System.currentTimeMillis();
        System.out.println("Threads nr: " + numberOfThreads + " - Time: " + (tf - ts) / (double) 1000);
    }

}
