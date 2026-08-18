class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(n == k){
            int max = nums[0];
            for(int i=1;i<n;i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
            return max;
        }
        int count[] = new int[51];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        if(k == 1){
            int answer = -1;
            for(int i=0;i<n;i++){
                if(count[nums[i]] == 1){
                    answer = Math.max(answer,nums[i]);
                }
            }
            return answer;
        }
        int answer = -1;
        if(count[nums[0]] == 1){
            answer = Math.max(answer,nums[0]);
        }
        if(count[nums[n-1]] == 1){
            answer = Math.max(answer,nums[n-1]);
        }
        return answer;
    }
}