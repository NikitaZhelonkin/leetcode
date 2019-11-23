import java.util.Arrays;

public class HouseRobber {

    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return rob(nums, 0, memo);
    }

    private int rob(int[] nums, int i, int[] memo) {
        if (i >= nums.length) return 0;
        if (memo[i] >= 0) return memo[i];
        return memo[i] = Math.max(rob(nums, i + 2, memo) + nums[i], rob(nums, i + 1, memo));
    }


    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        System.out.println(robber.rob(new int[]{
                1, 2, 3, 1//4
        }));
        System.out.println(robber.rob(new int[]{
                2, 7, 9, 3, 1//12
        }));
        System.out.println(robber.rob(new int[]{
                2, 1, 1, 2//4
        }));
        System.out.println(robber.rob(new int[]{
                0, 10, 0, 0, 10, 1//20
        }));
    }
}
