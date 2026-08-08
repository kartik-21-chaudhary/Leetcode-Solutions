class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binary);
        String rev = sb.reverse().toString();
        int count = 0;
        for(int i=0;i<binary.length();i++){
            if(rev.charAt(i) != binary.charAt(i)){
            count++;
            }
        }
        return count;
    }
}