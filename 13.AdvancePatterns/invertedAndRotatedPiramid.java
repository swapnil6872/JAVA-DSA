public class invertedAndRotatedPiramid {

    public static void iR(int n) {

        for (int i = 1; i<=n; i++) {
                       // outerLoop Handaling the lines 
               for(int s =1; s<=n-i; s++){
                System.out.print(" "); // pritn spaces 
               }
               for(int j = 1 ; j<=i; j++){
                System.out.print("*"); // print * 
               }

               System.out.println(); //   next line 
         }

        }

    public static void main(String[] args) {
        iR(5);
    }
}