import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int value = 0;
        for (int num : nums) {
            value ^= num;
        }

        return value;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
