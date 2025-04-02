public class _01Triangle {

    public static void tri01(int n){
        int counter= 0;
         for(int i = 1; i <=n ;i++){
            for(int j = 1 ; j<=i ;j++){ 
                if(counter % 2==0){    //   Alternatively, we can use (i + j) % 2 == 0 for the same effect becouse i+j defined position of matrix(row and col).
                    System.out.print('1');
                }else{
                    System.out.print('0');
                }
                counter++;
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        tri01(5);
    }
}
