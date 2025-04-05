public class printSubArray {

    public static void SubArray(int arr[]) {

        // Outer loop: controls the starting index of the subarray
        for (int i = 0; i < arr.length; i++) {

            // Middle loop: controls the ending index of the subarray
            for (int j = i; j < arr.length; j++) {

                // Inner loop: prints all elements from i to j (a subarray)
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println(); // Print a newline after printing each subarray
            }
            System.out.println(); // Extra newline after all subarrays starting with arr[i]
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        SubArray(arr);

    }

}
// timecomplexity = o(n3)

// output

// 2
// 24
// 246
// 2468
// 246810

// 4
// 46
// 468
// 46810

// 6
// 68
// 6810

// 8
// 810

// 10