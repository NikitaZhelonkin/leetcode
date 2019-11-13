public class Sqrtx {

    public int mySqrt(int x) {
        if (x < 2) return x;
        int l = 0;
        int r = x / 2 + 1;
        while (l != r) {
            int m = (l + r) / 2;
            if ((m * (long) m) < x) {
                l = m + 1;
            } else if (m * (long) m > x) {
                r = m;
            } else {
                return m;
            }
        }
        return l - 1;
    }

    public static void main(String[] args) {
        System.out.println(new Sqrtx().mySqrt(2147395599));
    }
}
