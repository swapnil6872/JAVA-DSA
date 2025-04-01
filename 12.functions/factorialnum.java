import java.util.Scanner;

public class factorialnum {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int n = sc.nextInt();
        System.out.print("fact = :" + fact(n));
        sc.close();
    }
}
