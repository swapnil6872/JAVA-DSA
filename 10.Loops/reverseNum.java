public class reverseNum {
    public static void main (String args[]){
        int num = 12345;
        int rev = 0;
        while (num > 0) {
            int lastdig = num %10 ;
            rev = (rev * 10) + lastdig; 
            num /=10;
        }
        System.out.println(rev);
    }
}
