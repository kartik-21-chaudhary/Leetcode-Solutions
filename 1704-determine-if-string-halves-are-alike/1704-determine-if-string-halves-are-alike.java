class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        int mid = s.length()/2;
        for(int i=0;i<mid;i++){
            if(isvowel(s.charAt(i))){
                count1++;
            }
        }
        for(int i=mid;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }else{
            return false;
        }
    }
     public static boolean isvowel(char ch){
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                return true;
            }
            return false;
        }
}