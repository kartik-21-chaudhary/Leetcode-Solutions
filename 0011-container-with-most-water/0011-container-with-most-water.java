class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int i = 0; int j = n - 1;
        while (i < j) {
            int width = j - i;
            int h = Math.min(height[i], height[j]);
            int area = h * width;
            maxArea = Math.max(area, maxArea);
            
            if (height[i] < height[j]) {
                i++; 
            } else {
                j--;
            }
        } 
        return maxArea;
    }
}
