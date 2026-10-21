/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input : s = "anagram" , t = "nagaram"

Output : true

Explanation :

We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.

Example 2:
Input : s = "dog" , t = "cat"

Output : false

Explanation :

We cannot rearrange the characters of string s to get string t as frequency of all characters from both strings is not same */
import java.util.Scanner;
class Solution {  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s = sc.nextLine();
        System.out.println("Enter second string:");
        String t = sc.nextLine();
        System.out.println(sol.anagramStrings(s, t));
        sc.close();
    }
}
