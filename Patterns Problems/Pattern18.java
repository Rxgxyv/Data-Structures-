/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

E
D E
C D E
B C D E
A B C D E

Print the pattern in the function given to you. */
class Solution {
    public void pattern18(int n) {
        char start = (char)('A'+ n - 1);
        for(int i = 0; i < n; i++){
            char ch = start;
            for(int j = 0; j<=i; j++){
                System.out.print(ch+ " ");
                ch++;
            }
            start--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern18(n);
    }
}