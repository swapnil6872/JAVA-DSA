public class palidrome {

    public static boolean isPalidrome(int n){
        int rev=0;
        int palidrome=n;
        while (n > 0) {
            int ld = n % 10; 
            rev=(rev*10)+ld;
            n /=10;
        }
        if( palidrome == rev){
            return true;
        }
        return false;
    }
    public static void checkPalidrome(int n){
       if(isPalidrome(n)){
          System.out.println("the number is palidrome");
       }
       else
       System.out.println("the number is not a palidrom");
    }
    public static void main(String[] args) {
        checkPalidrome(123454321);
    }
}
