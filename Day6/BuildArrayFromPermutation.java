package Day6;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }

        return arr;
    }

    // main method for VS Code testing
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = buildArray(nums);

        // print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

