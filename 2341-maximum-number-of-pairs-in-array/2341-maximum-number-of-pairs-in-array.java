class Solution {
    public int[] numberOfPairs(int[] nums) {
        int freq[] = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int pairs = 0 ; int left = 0;

        for(int i=0;i<freq.length;i++){
            pairs += freq[i] / 2;
            left += freq[i] % 2;
        }
        return new int[]{pairs,left};
    }
}