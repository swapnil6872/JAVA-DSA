import java.util.Scanner;

public class average3num {

    public static int avg(int a ,int b ,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num 1:");
        int a = sc.nextInt();
        System.out.print("enter a num 2:");
        int b=sc.nextInt();
        System.out.print("enter a num 3:");
        int c=sc.nextInt();

        System.out.print(avg(a, b, c));
        sc.close();
    }
    
}
