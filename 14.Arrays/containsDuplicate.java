import java.util.Arrays;

public class containsDuplicate {

     public static boolean bruteforce(int[] nums) {
         Arrays.sort(nums);
         for(int i= 1 ; i < nums.length; i++){
             if(nums[i-1] == nums[i]) return true;
         }
         return false;
    }
    public static void main(String[] args) {
        int nums[]= {0,4,5,0,3,6};
        bruteforce(nums);
    }
}