public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int number = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            number += Math.pow(26, s.length() - i - 1) * (s.charAt(i) - 'A' + 1);
        }
        return number;
    }

    public int titleToNumber2(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number *= 26;
            number += (s.charAt(i) - 'A' + 1);
        }
        return number;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber sol = new ExcelSheetColumnNumber();
        System.out.println(sol.titleToNumber("ZY"));
    }
}
