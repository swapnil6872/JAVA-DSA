public class printReverseNum {
    public static void main(String args[]){
        int num = 123456;
        
        while (num > 0) {
            int lastdig = num %10;
            System.out.print(lastdig);
            num /=10;
        }
    }
}
