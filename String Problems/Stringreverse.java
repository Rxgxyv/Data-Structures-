/*Reverse a String II
Given a string, the task is to reverse it. The string is represented by an array of characters s.

Perform the reversal in place with O(1) extra memory.

Note: no need to return anything, modify the given list.

Example 1:
Input : s = ["h", "e" ,"l" ,"l" ,"o"]

Output : ["o", "l", "l", "e", "h"]

Explanation :

The given string is s = "hello" and after reversing it becomes s = "olleh".

Example 2:
Input : s = ["b", "y" ,"e" ]

Output : ["e", "y", "b"]

Explanation :

The given string is s = "bye" and after reversing it becomes s = "eyb". */
import java.util.*;
class Solution {
    public void reverseString(List<Character> s) {
        int left = 0;
        int right = s.size()-1;

        while(left<right){
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right,temp);

            left++;
            right--;
        }
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String input = sc.nextLine();
        List<Character> s = new ArrayList<>();
        for(char c : input.toCharArray()){
            s.add(c);
        }
        sol.reverseString(s);
        System.out.println("Reversed string: " + s);
    }
}
