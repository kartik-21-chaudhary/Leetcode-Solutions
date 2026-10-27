class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current=0;
            int next=0;
        if(s.charAt(i)=='I'){
            current=1;
        }
        else if(s.charAt(i)=='V'){
            current=5;
        }
        else if(s.charAt(i)=='X'){
            current=10;
        }
        else if(s.charAt(i)=='L'){
            current = 50;
        }
        else if(s.charAt(i)=='C'){
            current=100;
        }
        else if(s.charAt(i)=='D'){
           current=500;
        }
        else if(s.charAt(i)=='M'){
            current=1000;
        }
        if(i+1<s.length()){
            char c = s.charAt(i+1);
             if(c=='I'){
                next=1;
        }
        else if(c=='V'){
           next=5;
        }
        else if(c=='X'){
            next=10;
        }
        else if(c=='L'){
            next = 50;
        }
        else if(c=='C'){
            next=100;
        }
        else if(c=='D'){
           next=500;
        }
        else if(c=='M'){
            next=1000;
        }
        }
        if(current < next) {
            sum -= current;
        } 
        else{
            sum += current;
        }
        }
        return sum;  
    }
}