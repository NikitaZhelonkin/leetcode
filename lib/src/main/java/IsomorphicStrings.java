import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) return false;
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        return toInt(s) == toInt(t);
    }

    private int toInt(String s) {
        HashMap<Character, Integer> set = new HashMap<>();
        int result = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.containsKey(s.charAt(i))) {
                set.put(s.charAt(i), ++c);
            }

            result *= 10;

            result += set.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        IsomorphicStrings sol = new IsomorphicStrings();
        System.out.println(sol.isIsomorphic("ab", "aa"));
        System.out.println(sol.isIsomorphic("ab", "ca"));
    }
}
