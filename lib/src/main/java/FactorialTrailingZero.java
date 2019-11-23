
public class FactorialTrailingZero {

    public int trailingZeroes(int n) {
        int result = 0;
        while (n != 0) {
            n /= 5;
            result += n;
        }
        return result;
    }


    public static void main(String[] args) {
        FactorialTrailingZero factorialTrailingZero = new FactorialTrailingZero();
        System.out.println(factorialTrailingZero.trailingZeroes(4));
    }
}
