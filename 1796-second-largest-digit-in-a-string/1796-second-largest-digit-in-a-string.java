class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int seclar = -1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                int num = c - '0';
            if(num > max){
                seclar = max;
                max = num;
            }
            else if(num < max && num > seclar){
                seclar = num;
            }
            }
        }
        return seclar;
    }
}