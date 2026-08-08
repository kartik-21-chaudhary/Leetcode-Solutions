class Solution {
    public int minMoves(int[] nums) { 
        int max = nums[0]; 
        long sum = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sum += nums[i]; 
        }
        return (int) ((long) max * nums.length - sum);

    }
}
