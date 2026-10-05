class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target) {
                res = i;
                break;
            }else res = -1;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = sol.linearSearch(nums, target);
        System.out.println(result);
    }
}