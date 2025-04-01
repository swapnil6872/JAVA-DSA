import java.util.Scanner;
public class productAb {
    public static int isproductAb(int a ,int b){
        return a * b;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num:");
        int a = sc.nextInt();
        System.out.print("enter a num:");
        int b = sc.nextInt();
        System.out.println("productAb i s: "+ isproductAb(a,b));
        sc.close();
    }
}