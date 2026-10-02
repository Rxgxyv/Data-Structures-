// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *

// **

// ***

// ****

// *****

// Print the pattern in the function given to you.

class Solution {
    public void pattern2(int n) {

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern2(n);
    }
}