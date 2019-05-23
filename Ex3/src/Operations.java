public class Operations {

    public static boolean isPrimeNumber(long n) {
        for (long i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
