package Day_23.HomeTask;

public class RangeSumQuery {
    static int[] prefix;
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        buildPrefix(nums);
        System.out.println(sumRange(0, 2));
        System.out.println(sumRange(2, 5));
        System.out.println(sumRange(0, 5));
    }
    public static void buildPrefix(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    public static int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}