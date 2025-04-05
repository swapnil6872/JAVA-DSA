public class linearSearch {

    public static int lsearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int idx = lsearch(nums, key);
        if (idx == -1) {
            System.out.println("key not exists");
        } else
            System.out.println("Kay at the index" + idx);

    }
}

// time complexity = o(n)