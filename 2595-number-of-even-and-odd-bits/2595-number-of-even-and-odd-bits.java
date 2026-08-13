class Solution {
    public int[] evenOddBit(int n) {
        int res[] = new int[2];
        int count = 0;
        while(n>0){
            if((n & 1) == 1){
                res[count % 2]++;
            }
            n>>=1;
            count++;
        }
        return res;
    }
}