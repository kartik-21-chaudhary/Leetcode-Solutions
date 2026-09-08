class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxdist = 0;
        int minval = colors[0];
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(colors[i] != colors[j]){
                    maxdist = Math.max(maxdist,j-i);
                }
            }
        }
        return maxdist;
    }
}