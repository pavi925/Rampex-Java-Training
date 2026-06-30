package Day_8.ClassTask;
import java.util.Arrays;
public class ReverseInplace {
    public static void main(PrintName[] args){
        int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        int temp = 0;
        int n = nums.length;
        for(int i = 0;i<nums.length/2;i++) {
            temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

}
