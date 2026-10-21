/*  Palindrome Check
You are given a string s. Return true if the string is palindrome, otherwise false.

A string is called palindrome if it reads the same forward and backward.

Example 1:
Input : s = "hannah"

Output : true

Explanation :

The given string when read backward is -> "hannah", which is same as when read forward.

Hence answer is true.

Example 2:
Input : s = "aabbaaa"

Output : false

Explanation :

The given string when read backward is -> "aaabbaa", which is not same as when read forward.

Hence answer is false. */

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "hannah";
        String s2 = "aabbaaa";
        System.out.println(sol.isPalindrome(s1)); // true
        System.out.println(sol.isPalindrome(s2)); // false
    }
}
