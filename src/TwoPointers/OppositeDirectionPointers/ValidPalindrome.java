package TwoPointers.OppositeDirectionPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String procesedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] string = procesedString.toCharArray();

        int left = 0;
        int right = string.length-1;
        while (left<right) {
            if (string[left] != string[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("`l;`` 1o1 ??;l`"));
    }
}
