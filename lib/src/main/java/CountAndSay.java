public class CountAndSay {


    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        return countAndSay(s);
    }

    public String countAndSay(String s) {
        StringBuilder b = new StringBuilder();
        int j = 0;
        int i = 1;
        for (;i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j)) {
                b.append(i - j).append(s.charAt(j));
                j = i;
            }
        }
        b.append(i - j).append(s.charAt(j));
        return b.toString();
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(5));
    }
}
