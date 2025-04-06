public class trapingWater {

    public static int trapWater(int nums[]) {

        int n = nums.length;
        // calculate left boundry using auxiliary Arrays
        // auxiliry Arrays are helper Arrays
        int leftBoundry[] = new int[n];
        leftBoundry[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftBoundry[i] = Math.max(nums[i], leftBoundry[i - 1]);
        }

        // calculate right boundry using auxiliary Arrays
        int rightBoundry[] = new int[n];
        rightBoundry[rightBoundry.length - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightBoundry[i] = Math.max(nums[i], rightBoundry[i + 1]);
        }

        // calculate trapwater
        // wholewater = min(leftboudry , rightboudry);
        // tapwater = (wholewater hight - barhight )* width;

        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            trapWater += Math.min(leftBoundry[i], rightBoundry[i]) - nums[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 2, 0, 3, 2, 5 };
        int o = trapWater(nums);
        System.out.println(o);
    }
}
