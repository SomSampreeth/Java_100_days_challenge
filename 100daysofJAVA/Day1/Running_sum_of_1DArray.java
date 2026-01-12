import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {

        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            nums[i]=sum;
        }
        return nums;
        
    }
}


// for(int i=1;i<nums.length;i++){
//             nums[i]=nums[i-1]+nums[i];
//         }
//         return nums;
        

public class Running_sum_of_1DArray{
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        Solution s = new Solution();
        int[] result = s.runningSum(nums);

        System.out.println(Arrays.toString(result));
        //Arrays.toString converts array into readable string without this you wont get the output.
    }

}