public class binarySearch {

    public static int binarySearc(int nums[], int key) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (nums[mid] == key) { // key found
                return mid;
            } else if (key < nums[mid]) { //  left
                end = mid - 1;
            } else { // right
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 2;
        int idx = binarySearc(nums, key);
        if (idx == -1) {
            System.out.println("key not exists");
        } else {
            System.out.println("Kay at the index:" + idx);

        }

    }
}
//  Time complexity = O(log n).