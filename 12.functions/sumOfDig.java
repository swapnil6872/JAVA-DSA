public class sumOfDig {
 
     public static long sumdig(long n){
          long sum=0;
          while (n>0) {
            long ld = n %10;
            sum = sum+ld;
            n /=10;
          }
          return sum;
     }
     public static void main(String[] args) {
        System.out.println(sumdig(1234789100));
     }
}
