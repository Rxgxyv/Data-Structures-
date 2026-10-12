/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A

AB

ABC

ABCD

ABCDE

Print the pattern in the function given to you. */
class Solution {
    public void pattern14(int n) {
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = 0; j < i; j++){
                System.out.print(ch+" ");//Alternative System.out.print((char)('A' + j));
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern14(n);
    }
}