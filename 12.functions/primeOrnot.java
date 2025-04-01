public class primeOrnot {

    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        int totol = 0;
        for (int i = 1; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " \n");
                totol++;
            }
           
        }

        System.out.println("totol range :"+totol);

    }

    public static void main(String[] args) {
        // System.out.println(isprime(12));
        primeRange(100);
    }
}