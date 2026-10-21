/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5
Print the pattern in the function given to you. */
class Solution {
    public void pattern22(int n) {
        for(int i = 0; i < 2*n-1; i++){
            for(int j = 0; j < 2*n-1; j++){
                int frmBottom = 2*n - 2 - i;
                int frmRight = 2*n - 2 - j;
                int minDist=Math.min(Math.min(i, j), Math.min(frmBottom, frmRight));
                int num = n - minDist;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7; // You can change this value to test with different N
        sol.pattern22(n);
    }
}