public class pairsInArray {

    public static void pairsArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairsArray(arr);
        int n = arr.length;
        int totolPair = n*(n-1) / 2;
        System.out.print("totol pairs = "+totolPair);
    }
}
// totol pair = n(n-1) / 2

//time coplexity = o(n²)