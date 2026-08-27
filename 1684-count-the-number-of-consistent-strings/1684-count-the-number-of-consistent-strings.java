class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String w : words) {
            if (w.matches("[" + allowed + "]*")) 
            { 
                count++;
            }
        }
        return count;
    }
}