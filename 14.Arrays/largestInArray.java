public class largestInArray {

    public static int largestInx(int num[]) {
        int large = Integer.MIN_VALUE; // Initialize 'large' with the smallest possible integer value.
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int num[] = { 1, 4, 5, 8, -1, -4, 23, 11, 4, 6, 8 };
        int l = largestInx(num);
        System.out.println("Largest num is :" + l);
    }

}

// time complexity = o(n)