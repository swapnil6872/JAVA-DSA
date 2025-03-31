import java.util.Scanner;

public class factorialNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        int fact= 1;
        while (n>0) {
            fact = fact * n;
            n= n-1;
        }
        System.out.println(fact);
        sc.close();
    }
    
}
