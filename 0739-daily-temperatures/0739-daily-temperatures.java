class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] arr = new int[nums.length];
       Stack<Integer> s1 = new Stack<>();
       for(int i=0;i<nums.length;i++){
       
        while(!s1.isEmpty() && nums[s1.peek()] < nums[i]){
           arr[s1.peek()]= i - s1.pop();
        }
        s1.push(i);

       }
       return arr;
    }
}