/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

Print the pattern in the function given to you. */
class Solution {
    public void pattern17(int n) {
        for(int i = 1; i <=n; i++){
            for(int j = n-i; j>=1;j--){
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            ch -= 2;

            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern17(n);
    }
}