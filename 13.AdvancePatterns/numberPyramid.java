public class numberPyramid {

    public static void  nPyramid(int n ){

        for(int i =1 ; i <= n; i++){
           // Print leading spaces
            for(int j = 1 ; j<=n-i;j++ ){
                System.out.print(" ");
            }
             // Print numbers 
            for(int j=1 ; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        nPyramid(5);
    }
}







