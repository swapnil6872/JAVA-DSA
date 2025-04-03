public class hollowHumbus {

    public static void hollowHumbusPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= n; r++) {
                if (i == 1 || r == 1 || i == n || r == n) {
                    // if row == 1 || col ==1 || row == 4 || col ==4
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowHumbusPattern(5);
    }
}