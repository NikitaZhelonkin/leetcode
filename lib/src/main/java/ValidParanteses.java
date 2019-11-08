import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanteses {

    public static void main(String[] args) {
        System.out.println(isValid("([{(){}}])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> maping = new HashMap<>();
        maping.put(')', '(');
        maping.put(']', '[');
        maping.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(maping.containsValue(bracket)){
                stack.push(bracket);
            }else if(!stack.isEmpty() && maping.get(bracket) ==stack.peek()){
                stack.pop();
            }else {
                stack.push(bracket);
            }
        }
        return stack.isEmpty();
    }
}
