import java.util.*;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;

        int max = 0;

        Set<Character> unique = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int size = unique.size();
            unique.add(s.charAt(i));

            if (unique.size() > max) {
                max = unique.size();
            }

            if (size == unique.size()) {
                while (s.charAt(left) != s.charAt(i)) {
                    unique.remove(s.charAt(left));
                    left++;
                }

                left++;
            }

        }

        return max;
    }
}