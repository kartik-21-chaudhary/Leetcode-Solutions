class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        
        int window = s1.length();
        int length = s2.length();
        int s1Array[] = new int[26];
        int s2Array[] = new int[26];

        for(int i=0;i<window;i++){
            int s1i = s1.charAt(i) - 'a';
            int s2i = s2.charAt(i) - 'a';
            s1Array[s1i]++;
            s2Array[s2i]++;
        }
         if(Arrays.equals(s1Array,s2Array)){
                return true;
            }

        for(int i=1;i<=length-window;i++){
            int prev = s2.charAt(i-1) - 'a';
            int next = s2.charAt(i+window-1) - 'a';
            s2Array[prev]--;
            s2Array[next]++;
            if(Arrays.equals(s1Array,s2Array)){
                return true;
            }
        }
        return false;
    }
}