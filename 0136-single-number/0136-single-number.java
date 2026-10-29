class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            //for(int j=0;j<nums.length-1;j++){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            //}
        }
        return nums[nums.length-1];
    }
}