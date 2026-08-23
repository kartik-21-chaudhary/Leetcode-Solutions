class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int count[] = new int[n+1];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        int dup = 0,miss = 0;
        for(int i=1;i<=n;i++){
            if(count[i] == 2){
                dup = i;
            }if(count[i] == 0){
                miss = i;
            }
        }
        return new int[]{dup,miss};
    }
}