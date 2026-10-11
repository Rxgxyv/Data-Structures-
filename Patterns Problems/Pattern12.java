/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321
Print the pattern in the function given to you. */
class Solution {
    public void pattern12(int n) {
        int space = 2 * (n - 1);
        for(int i = 1; i <=n; i++){
            for(int j=1;j<=i;j++){
                 System.out.print(j);
            }
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int k = i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2000;
        System.out.println("Pattern with n = " + n + ":");
        sol.pattern12(n);
    }
}