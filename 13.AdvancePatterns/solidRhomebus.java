public class solidRhomebus {

    public static void solidRP(int n){
        for(int i=n ; i>=1 ;i--){
            for(int j =1;j<=i-1;j++){
                System.out.print(" ");
            }
            
            for(int s = 1 ; s<n;s++){
                System.out.print("*");
            }

            System.out.println();
          
        }
    }
    public static void main(String[] args) {
        solidRP(5);
    }
}