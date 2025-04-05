public class MaxSubArrSum {

    public static void bruteforcesum(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                counter += arr[j];
                if (counter > max) {
                    max = counter;
                }
                System.out.print(counter + " ");
            }
            System.out.println();
        }
        System.out.println("max subarray sum is :" + max);
    }

    public static void prifixsum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prifix[] = new int[arr.length];

        prifix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
            // System.out.println(prifix[i]);
        }
        for (int i = 0; i < arr.length; i++) { // i= start
            int currSum = 0; 
            for (int j = i; j < arr.length; j++) {  // calculate end  j = end ;
                currSum = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
                if (currSum > max) {
                    max = currSum;
                 }
            }
        }
        System.out.println("max sum = " + max);
    }

    // kadane's algorithm
    public static void kadansalgo(int arr[]){
       int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            if(currSum < 0){
                currSum=0;
            }
            currSum +=arr[i];
            if(currSum >maxSum){
                maxSum=currSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // bruteforcesum(arr);
        // prifixsum(arr);
        kadansalgo(arr);

    }
}
