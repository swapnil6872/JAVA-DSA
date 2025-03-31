import java.util.Scanner;

public class oodEvensum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int num;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter a number:");
            num = sc.nextInt();
           if(num % 2 == 0){
            evenSum +=num;
           }else{
            oddSum += num;
           }
           System.out.print("press 1 if contine and press 0 if exit loop");
           choice = sc.nextInt();
        }while(choice==1);
        System.out.println("evenSum is :" + evenSum);
        System.out.println("oddSum is :"+ oddSum);
        sc.close();
    }
}