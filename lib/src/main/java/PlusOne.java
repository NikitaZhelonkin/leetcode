import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int mem = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += mem;
            if (digits[i] > 9) {
                mem = 1;
                digits[i] = 0;
            } else {
                mem = 0;
            }
        }
        if (mem == 0) return digits;
        int[] result = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3})));
    }
}
