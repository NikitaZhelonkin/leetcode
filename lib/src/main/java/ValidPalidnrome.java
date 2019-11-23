public class ValidPalidnrome {

    //production
//    public boolean isPalindrome(String s) {
//        String escaped = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//        String reversed = new StringBuffer(escaped).reverse().toString();
//        return escaped.equals(reversed);
//    }

    //fast
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (!Character.isLetterOrDigit(left)) {
                i++;
            } else if (!Character.isLetterOrDigit(right)) {
                j--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) return false;
                i++;
                j--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalidnrome validPalidnrome = new ValidPalidnrome();
        System.out.println(validPalidnrome.isPalindrome("race a car"));
    }
}
