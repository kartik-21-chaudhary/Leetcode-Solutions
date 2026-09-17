class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int result[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int orgrow = (i + colShift[j]) % n;
                int orgcol = (j + rowShift[orgrow]) % n;
                result[i][j] = grid[orgrow][orgcol];
            }
        }
        return result;
    }
}