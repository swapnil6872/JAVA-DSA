public class reverseArray {

    public static void reverse(int nums[]) {

        int first = 0;
        int last = nums.length - 1;
        int temp;

        while (first < last) {
            temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
