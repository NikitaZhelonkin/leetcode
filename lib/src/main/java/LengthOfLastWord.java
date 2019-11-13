public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                c++;
            } else if (c != 0) {
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("dsfssd fdsf "));
    }
}
