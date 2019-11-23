import java.util.HashMap;

public class HappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = convert(slow);
            fast = convert(convert(fast));
        } while (fast != slow);
        return slow == 1;
    }

    private int convert(int n) {
        int t = 0;
        while (n != 0) {
            int d = n % 10;
            t += d * d;
            n /= 10;
        }
        return t;
    }


    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }
}
