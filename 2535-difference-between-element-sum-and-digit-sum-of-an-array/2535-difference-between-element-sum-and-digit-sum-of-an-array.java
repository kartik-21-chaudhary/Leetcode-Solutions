class Solution {
    public int differenceOfSum(int[] nums) {
        int arrsum = 0;
        int eachsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum += nums[i];
            int num = nums[i];
            while (num > 0) {
                eachsum += num % 10; 
                num = num / 10;     
            }
        }
        return Math.abs(arrsum - eachsum);
    }
}
