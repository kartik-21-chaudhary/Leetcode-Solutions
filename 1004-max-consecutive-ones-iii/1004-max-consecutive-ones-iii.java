class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max_ans = 0;
        for(int i = 0; i < n; i++) {
            int countzero = 0;
            for(int j = i; j < n; j++) {
                if(nums[j] == 0) {
                    countzero++;
                }
                if(countzero <= k) {
                    max_ans = Math.max(max_ans, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return max_ans;
    }
}