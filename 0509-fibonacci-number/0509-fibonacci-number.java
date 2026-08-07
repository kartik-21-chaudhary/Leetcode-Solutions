class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int fir = 0;
        int sec = 1;

        for(int i=1;i<n;i++){
            int next = fir+sec;
            fir = sec;
            sec = next;
        }
        return sec;
    }
}