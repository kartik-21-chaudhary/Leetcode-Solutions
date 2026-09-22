class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        for(int i=0;i<2;i++){
            for(int j=0;i<n-j-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int ans = (nums[n-1]-1)*(nums[n-2]-1);
        return ans;
    }
}