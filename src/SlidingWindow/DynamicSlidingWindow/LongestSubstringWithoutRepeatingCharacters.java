package SlidingWindow.DynamicSlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestSubstring = 0;
        HashSet<Character> char_list = new HashSet<>();

        for (int right = 0; right < s.length() ; right++) {
            while (char_list.contains(s.charAt(right))){
                char_list.remove(s.charAt(left));
                left++;
            }

            char_list.add(s.charAt(right));
            longestSubstring = Math.max(longestSubstring, right - left + 1);

        }


        return longestSubstring;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
