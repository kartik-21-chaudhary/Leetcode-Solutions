class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxval = 0;
        int start = 0, end = n-1;
        while(start < end){
            if(height[start] < height[end]){
                maxval = Math.max(maxval,height[start] * (end - start));
                start++;
            }else{
                maxval = Math.max(maxval,height[end]*(end-start));
            end--;
            }
        }
        return maxval;
    }
}