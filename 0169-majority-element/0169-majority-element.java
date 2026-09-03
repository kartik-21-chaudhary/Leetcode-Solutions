class Solution {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int vote = 1;
        for(int i =1;i<nums.length;i++){
            if(vote == 0){
            element = nums[i];
            vote = 1;
        }
            else if(element == nums[i] ){
                vote++;
            }
            else{
            vote--;
        }        
        }
        return element;
    }
}