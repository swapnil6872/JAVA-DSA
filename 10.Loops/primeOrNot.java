import java.util.Scanner;

public class primeOrNot {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a number:");
      int n = sc.nextInt();
      if(n==2){
        System.out.println("number is prime");
      }else{
        boolean isPrime=true;
        for(int i=2 ; i<=Math.sqrt(n); i++){
           if(n % 2 == 0){
            isPrime=false;
           }
         }
         if(isPrime){
            System.out.println(n+" "+"is prime");
         }
         else{
            System.out.println(n+" "+"is not a prime");
         }
      }
      sc.close();
    }
}