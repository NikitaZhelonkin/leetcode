public class ExcelSheetColumnTitle {


    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        for (int x = n; x != 0; x = (x - 1) / 26) {
            builder.append((char) ('A' + (x - 1) % 26));
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        test(1, "A");
        test(26, "Z");
        test(27, "AA");
        test(28, "AB");
        test(52, "AZ");
        test(701, "ZY");
    }

    private static void test(int n, String expect) {
        ExcelSheetColumnTitle title = new ExcelSheetColumnTitle();
        System.out.println(n + ": result: " + title.convertToTitle(n) + " expect:" + expect);
    }


}
