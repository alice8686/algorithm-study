/**
 * 
 */
package array;

/**
 * @author weiyan.xiang
 * @date 26 Feb 2018
 */
public class MaxSubArray {
    /*
     * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous
     * subarray [4,-1,2,1] has the largest sum = 6.
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // dp[i] means the maximum subarray ending with A[i];
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = dp[i] < max ? max : dp[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("6 == " + maxSubArray(input));
    }
}
