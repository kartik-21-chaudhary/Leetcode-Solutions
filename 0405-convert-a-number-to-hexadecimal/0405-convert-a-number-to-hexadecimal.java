class Solution {
    public String toHex(int n) {
        if(n==0){
            return "0";
        }
        String hex = "0123456789abcdef";
        char[] ans = new char[8];
        int i=7;
        while (n!=0){
            int value = n & 15;
            ans[i] = hex.charAt(value);
            i--;
            n=n>>>4;
        }
        return new String(ans,i+1,7-i);
    }
}