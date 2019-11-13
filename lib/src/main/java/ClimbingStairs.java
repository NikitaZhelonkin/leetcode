import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 2) return n;
        int[] memo = new int[n];
        return climbStairs( 0, n, memo);
    }

    public int climbStairs(int s, int n, int[] memo) {
        if (s == n) return 1;
        if (s > n) return 0;
        if(memo[s]!=0) return memo[s];
        return memo[s] = climbStairs(s + 1, n, memo) + climbStairs(s + 2, n, memo);
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(4));
    }
}
