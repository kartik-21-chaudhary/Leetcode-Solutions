class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int min = 0;
        for(int i =0;i<nums.length;i++){
            if(i == nums.length-1){
                break
            }
            int gap = nums[i+1] - nums[i];
            min =  Math.max(min,gap);
        }
        return min;
        
    }
}