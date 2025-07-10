import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        boolean res = true;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put( ')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))) {
                stack.add(s.charAt(i));
            }

            if (map.containsKey(s.charAt(i))) {
                if (stack.size() == 0) {
                    return false;
                }
                char match = stack.pop();
                res = res && map.get(s.charAt(i)) == match;
            }

        }

        if (stack.size() != 0) {
            return false;
        }

        return res;
    }
}