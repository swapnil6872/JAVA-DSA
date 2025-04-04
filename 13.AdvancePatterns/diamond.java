public class diamond {

    // Method to print diamond pattern
    public static void diamondp(int n){
        // First half of the diamond (upper triangle)
        for(int i = 1 ; i <= n ; i++){
            // Print spaces before stars
            for(int j = 1 ; j <= n - i; j++){
                System.out.print(" ");
            }
            // Print left side stars including middle one
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            // Print right side stars (one less to avoid double middle star)
            for(int j = 1; j < i ; j++){
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();   
        }

        // Second half of the diamond (lower triangle)
        for(int i = n ; i >= 1 ; i--){
            // Print spaces before stars
            for(int j = 1 ; j <= n - i; j++){
                System.out.print(" ");
            }
            // Print left side stars including middle one
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            // Print right side stars (one less to avoid double middle star)
            for(int j = 1; j < i ; j++){
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();   
        }   
    }

    // Main method to call the pattern method
    public static void main(String[] args) {
        // Calling method with size 5
        diamondp(5);
    }
}
