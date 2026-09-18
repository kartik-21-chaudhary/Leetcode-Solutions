class Solution {
    public int sumOfUnique(int[] nums) {
        int count = 0; int sum = 0;
        int arr[] = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] == 1){
            sum = sum + i;
        }
    }
        return sum;
    }
}