class Solution {
    public boolean canAliceWin(int n) {
        int k=10;
        int count=0;
        while(n>=k){
            n-=k;
            k--;
            count++;
        }
        return count%2!=0;
    }
}