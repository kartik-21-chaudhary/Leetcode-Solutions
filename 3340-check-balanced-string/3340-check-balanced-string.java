class Solution {
    public boolean isBalanced(String num) {
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                evensum += Character.getNumericValue(num.charAt(i));
            }
            else{
                oddsum += Character.getNumericValue(num.charAt(i));
            }
        }
        if(evensum==oddsum){
            return true;
        }
        return false;
        
    }
}