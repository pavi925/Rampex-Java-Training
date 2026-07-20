package Day_23.HomeTask;

import java.util.Arrays;

public class RunningSum1D {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}