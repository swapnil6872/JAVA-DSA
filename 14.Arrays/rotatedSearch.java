public class rotatedSearch {

    public static int search(int nums[], int target) {
        int start = 0 ; 
        int end = nums.length-1;

        while(start <= end ){

            int mid = (start +end)/2;
            if(nums[mid]==target) return mid;
            // now identify tha which part is sortrd is it left or right 
            
            if(nums[start] <= nums[mid]){ // for leftpart if it is sorted must follow this  start < mid  else 100% right part sorted 
                // now for sorted part's search target in left part 

               if(nums[start] <= target && target <= nums[mid]){
                  end=mid-1;
               }else start=mid+1;
            } 
            // rightpart
            else{
                if( nums[mid] <= target &&  target<= nums[end]){
                    start= mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int nums[]= {-1,0,3,5,9,12};
        int nums[] = { 5,6,7,8,9,0,1,2,3,4};
        int key = 0;
        int op = search(nums, key);
        System.out.println(op);
    }
}
