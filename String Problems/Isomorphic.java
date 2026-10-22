/**
 * Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input : s = "egg" , t = "add"

Output : true

Explanation :

The 'e' in string s can be replaced with 'a' of string t.

The 'g' in string s can be replaced with 'd' of t.

Hence all characters in s can be replaced to get t.

Example 2:
Input : s = "apple" , t = "bbnbm"

Output : false

Explanation :

Strings are matched index by index.

At index 0, 'a' maps to 'b'.

At index 1, 'p' also maps to 'b'.

This is invalid because two different characters (a and p) cannot map to the same character (b) in a one-to-one mapping.

Therefore, no valid mapping exists and the output is false.
 */

class Solution {
    public boolean isomorphicString(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()){
            return false;
        }
        // Map<Character,Character> map = new HashMap<>();

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(mapST.containsKey(charS) && mapST.get(charS)!=charT){
                return false;
            }

            if(mapTS.containsKey(charT) && mapTS.get(charT)!=charS){
                return false;
            }

            mapST.put(charS,charT);
            mapTS.put(charT,charS);
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isomorphicString("egg", "add")); // true
        System.out.println(solution.isomorphicString("apple", "bbnbm")); // false
        System.out.println(solution.isomorphicString("foo", "bar")); // false
        System.out.println(solution.isomorphicString("paper", "title")); // true
        System.out.println(solution.isomorphicString("ab", "aa")); // false
        System.out.println(solution.isomorphicString("abcd", "efgh")); // true
        System.out.println(solution.isomorphicString("abcd", "efgg")); // false
        System.out.println(solution.isomorphicString("abc", "def")); // true
        System.out.println(solution.isomorphicString("abca", "zbxz")); // true
        System.out.println(solution.isomorphicString("abca", "zbxy")); // false
    }
}