import java.util.Scanner;

public class bionomialCoeff {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int  biocoeff(int n , int r){
        int factn =fact(n);
        int factr =fact(r);
        int factnmr= fact(n-r);
        return factn/(factr*factnmr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  n:");
        int n = sc.nextInt();
        System.out.print("enter r: ");
        int r = sc.nextInt();
        System.out.println(biocoeff(n, r));
        sc.close();
    }
}