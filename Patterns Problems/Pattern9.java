/**Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
Print the pattern in the function given to you.
 */

class Solution {
    public void pattern9(int n) {
        //upper pattern
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower pattern
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j< 2*(n-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern9(n);
    }
}