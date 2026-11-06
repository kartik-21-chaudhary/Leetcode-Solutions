class Solution {
    public String removeDigit(String number, char digit) {
        String num = "";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i) == digit){
                String num1 = number.substring(0,i) + number.substring(i+1);
                if(num.equals("") || num1.compareTo(num) > 0){
                    num = num1;
                }
            }
        }
        return num;
    }
}