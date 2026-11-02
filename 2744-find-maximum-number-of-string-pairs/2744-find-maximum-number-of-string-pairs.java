class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
       for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            if(check(words[i],words[j])){
                count++;
            }
        }
       }
       return count;
        
    }
    public static boolean check(String s1,String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}