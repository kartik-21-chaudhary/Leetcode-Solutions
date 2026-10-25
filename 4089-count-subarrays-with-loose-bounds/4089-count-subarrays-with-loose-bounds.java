class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long count = 0;
        int start = 0;
        
        for (int j = 0; j < n; j++) {
            if (nums[j] < minK || nums[j] > maxK) {
                start = j + 1;
            } else {
                count += (j - start + 1);
            }
        }
        
        return count;
    }
}