/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*****
*   *
*   *
*   *
*****
Print the pattern in the function given to you. */
class Solution {
    public void pattern21(int n) {
        for(int i = 1; i <=n; i++){
            // int stars = 
            for(int j = 1; j <=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }else if(j==1 || j== n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern21(n);
    }
}