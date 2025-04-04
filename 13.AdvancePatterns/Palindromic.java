public class Palindromic {

    public static void palidrompattern(int n) {

        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Print left side numbers in descending order
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Print right side numbers in ascending order (starting from 2)
            for (int j = 2; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palidrompattern(5);

    }

}
