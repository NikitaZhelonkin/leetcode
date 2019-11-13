public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int mem = 0;
        int l = Math.max(a.length(), b.length());
        for (int i = 0; i < l; i++) {
            int A = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int B = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;

            int r = (mem + A + B) % 2;
            mem = (mem + A + B) < 2 ? 0 : 1;
            sb.append(r);
        }
        if (mem > 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010", "1011"));
    }
}
