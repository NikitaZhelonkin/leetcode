public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int lastMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lastMax = Math.max(nums[i] + lastMax, nums[i]);
            if (lastMax > max) max = lastMax;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
