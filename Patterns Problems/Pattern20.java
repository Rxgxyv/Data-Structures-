/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        * 
*/
class Solution {
    public void pattern20(int n) {
         for (int i = 0; i < 2 * n - 1; i++) { 
            int stars = i < n ? i + 1 : 2 * n - i - 1;
            int spaces = 2 * (n - stars);
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 10;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern20(n);
    }
}